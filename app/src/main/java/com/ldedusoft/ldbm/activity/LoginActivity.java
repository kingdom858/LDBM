package com.ldedusoft.ldbm.activity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.ldedusoft.ldbm.R;
import com.ldedusoft.ldbm.activity.home.HomeActivity;
import com.ldedusoft.ldbm.adapters.LoginSpinnerAdapter;
import com.ldedusoft.ldbm.model.SysProperty;
import com.ldedusoft.ldbm.model.UserProperty;
import com.ldedusoft.ldbm.util.HttpCallbackListener;
import com.ldedusoft.ldbm.util.HttpUtil;
import com.ldedusoft.ldbm.util.ParseXML;
import com.ldedusoft.ldbm.util.interfacekits.InterfaceParam;

/**
 * Created by wangjianwei on 2016/6/22.
 */
public class LoginActivity extends BaseActivity implements View.OnClickListener,AdapterView.OnItemSelectedListener {

    private EditText username;
    private EditText password;
    private Button loginBtn;
    private String serverPath ;
    private String paramXml;
    private Spinner loginTypeSpinner;
    private ArrayAdapter<String> mAdapter ;
    private int loginResult; //登录返回值
    private ProgressDialog progressDialog;


    /**
     * 登录页面布局
     */
    private LinearLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ldbm_login);
        initLoginPage();
    }

    /**
     * 初始化登录页面
     */
    private void initLoginPage(){
        mainLayout = (LinearLayout)findViewById(R.id.root_layout);
        username = (EditText)findViewById(R.id.edittext_username);
        password = (EditText)findViewById(R.id.edittext_password);
        loginTypeSpinner = (Spinner)findViewById(R.id.spinner_loginType);
        loginBtn = (Button)findViewById(R.id.btn_login);
        loginBtn.setOnClickListener(this);
        username.setSelection(username.getText().length());

        //注册下拉列表监听器
        loginTypeSpinner.setOnItemSelectedListener(this);
        //通过加载xml文件配置的数据源
        Resources res=getResources();
        String[] loginTyps=res.getStringArray(R.array.loginType_array);
        mAdapter = new LoginSpinnerAdapter(this, loginTyps);
        mAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        loginTypeSpinner.setAdapter(mAdapter);

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("正在登录");
        progressDialog.setCanceledOnTouchOutside(false);


//        if( this.getResources().getConfiguration().orientation
//                != Configuration.ORIENTATION_LANDSCAPE){
//            //控制键盘
//            controlKeyboardLayout(mainLayout, findViewById(R.id.btn_login));
//        }


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_login:
                // 强制关闭系统键盘
                InputMethodManager imm = (InputMethodManager) this
                        .getSystemService(Context.INPUT_METHOD_SERVICE);
                if (imm.isActive()) {
                    imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                }
                if(TextUtils.isEmpty(username.getText())){
                    Toast.makeText(LoginActivity.this.getApplicationContext(),
                            "请输入用户名!", Toast.LENGTH_SHORT).show();
                    username.findFocus();
                }else if(TextUtils.isEmpty(password.getText())){
                    Toast.makeText(LoginActivity.this.getApplicationContext(),
                            "请输入密码!", Toast.LENGTH_SHORT).show();
                    password.findFocus();
                }else {
                   // ldbmLogin();
                    loginSuccess();
                }

        }
    }

    /**
     * 登录
     */
    private void ldbmLogin(){
        showProgressDialog();
        serverPath =InterfaceParam.SERVER_PATH;
        paramXml = InterfaceParam.getInstance().getLogin(username.getText().toString(), password.getText().toString());
        HttpUtil.sendHttpRequest(serverPath, paramXml, new HttpCallbackListener() {
            @Override
            public void onFinish(final String response) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        loginResult = Integer.parseInt(ParseXML.getItemValueWidthName(response, "LoginResult"));
                        if (loginResult == -1) {
                            //登录失败方法
                            loginError();
                        } else {
                            //登录成功方法
                            loginSuccess();
                        }

                    }
                });
            }

            @Override
            public void onWarning(String warning) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        closeProgressDialog();
                        Toast.makeText(LoginActivity.this, "登录失败,网络错误", Toast.LENGTH_SHORT).show();
                    }
                });
            }

            @Override
            public void onError(Exception e) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        closeProgressDialog();
                        Toast.makeText(LoginActivity.this, "登录失败,网络错误", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });


    }

    private void loginSuccess(){
        closeProgressDialog();
        String selectedType = loginTypeSpinner.getSelectedItem().toString();
        SysProperty.getInstance().setMode(selectedType);
        UserProperty.getInstance().setUserName(username.getText().toString());
        UserProperty.getInstance().setPassWord(password.getText().toString());
        UserProperty.getInstance().setUserType(loginResult);
        Log.d("LoginActivity", username.getText().toString() + "登录");
        Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
        startActivity(intent);

        System.gc();
        System.runFinalization();
        finish();
    }
    private void loginError(){
        closeProgressDialog();
        Toast.makeText(LoginActivity.this, "用户名或密码错误", Toast.LENGTH_SHORT).show();
    }



    /**
     * @param root 最外层布局，需要调整的布局
     * @param scrollToView 被键盘遮挡的scrollToView，滚动root,使scrollToView在root可视区域的底部
    */
    private void controlKeyboardLayout(final View root, final View scrollToView) {
        root.getViewTreeObserver().addOnGlobalLayoutListener( new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                Rect rect = new Rect();
                //获取root在窗体的可视区域
                root.getWindowVisibleDisplayFrame(rect);
                //获取root在窗体的不可视区域高度(被其他View遮挡的区域高度)
                int rootInvisibleHeight = root.getRootView().getHeight() - rect.bottom;
                //若不可视区域高度大于100，则键盘显示
                if (rootInvisibleHeight > 100) {
                    int[] location = new int[2];
                    //获取scrollToView在窗体的坐标
                    scrollToView.getLocationInWindow(location);
                    //计算root滚动高度，使scrollToView在可见区域的底部
                    int srollHeight = (location[1] + scrollToView.getHeight()) - rect.bottom;
                    root.scrollTo(0, srollHeight);
                } else {
                    //键盘隐藏
                    root.scrollTo(0, 0);
                }
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String itemString = parent.getItemAtPosition(position).toString();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    /**
     * 进度框
     */
    private void showProgressDialog(){
        if(progressDialog == null){
            progressDialog = new ProgressDialog(this);
            progressDialog.setMessage("正在登录");
            progressDialog.setCanceledOnTouchOutside(false);
        }
        progressDialog.show();
    }

    /**
     * 关闭进度对话框
     */
    private void closeProgressDialog(){
        if(progressDialog != null){
            progressDialog.dismiss();
        }
    }
}
