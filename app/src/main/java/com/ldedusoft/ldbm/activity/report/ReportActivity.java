package com.ldedusoft.ldbm.activity.report;

import android.content.Intent;
import android.os.Bundle;

import com.ldedusoft.ldbm.R;
import com.ldedusoft.ldbm.activity.BaseActivity;
import com.ldedusoft.ldbm.activity.home.HomeActivity;

/**
 * Created by wangjianwei on 2016/6/24.
 */
public class ReportActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ldbm_report);
    }



    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);
        finish();
    }
}
