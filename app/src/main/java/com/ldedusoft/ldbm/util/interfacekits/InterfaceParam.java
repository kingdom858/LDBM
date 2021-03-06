package com.ldedusoft.ldbm.util.interfacekits;

import com.ldedusoft.ldbm.model.UserProperty;

/**
 * Created by wangjianwei on 2016/6/27.
 */
public class InterfaceParam {

    private static InterfaceParam param;

    /**
     * 服务器地址
     */
    public static final String SERVER_PATH = "http://ldbm.ld-edusoft.com/webservers/WebService.asmx";

    public static final String SYS_USER = "admin";

    public static final String SYS_PASSWORD = "zwj6756";

    /**预约维修列表*/
    private String AP_AppointmentList;
    /**保存预约维修*/
    private String AP_AppointmentSave;
    /**库存成本异常*/
    private String BJ_InventoryCost;
    /**负库存报警*/
    private String BJ_NegativeInventory;
    /**库存配件缺货报警*/
    private String BJ_OutofStock;
    /**采购订单分析*/
    private String JH_BuyProject;
    /**进货汇总表*/
    private String JH_Restock;
    /**供应商累计供货排行*/
    private String JH_Supply;
    /**登陆*/
    private String  Login;
    /**修改密码*/
    private String ModifyPassword;
    /**配件品牌列表*/
    private String PT_BrandList;
    /**配件车型列表*/
    private String PT_CarTypeList;
    /**配件信息列表*/
    private String PT_FixingsList;
    /**配件类型*/
    private String PT_FixingsTypeList;
    /**配件仓库列表*/
    private String PT_FixingsWarehouseList;
    /**将采购计划单导入采购单*/
    private String PT_ImportPurchaseInfo;
    /**保存新配件信息*/
    private String PT_NewFixings;
    /**配件采购单（新建）*/
    private String PT_NewPurchaseFixings;
    /**新建配件销售单*/
    private String PT_NewSaleFixings;
    /**采购计划单列表*/
    private String PT_PlanList;
    /**配件采购单（保存）*/
    private String PT_SavePurchaseFixings;
    /**权限信息*/
    private String PowerInfo;
    /**客户类型列表*/
    private String PubClientTypeList;
    /**车辆信息列表*/
    private String Pub_CarCode;
    /**车辆颜色列表*/
    private String Pub_CarColorList;
    /**在库车辆*/
    private String Pub_CarList;
    /**车型列表*/
    private String Pub_CarTypeList;
    /**整车仓库列表*/
    private String Pub_CarWarehouseList;
    /**客户信息列表*/
    private String Pub_ClientList;
    /**发票信息*/
    private String Pub_InvoiceList;
    /**修改客户信息*/
    private String Pub_ModifyClientInfo;
    /**修改配件信息*/
    private String Pub_ModifyFixingtInfo;
    /** 经手人信息列表*/
    private String Pub_Salesman;
    /**保存车辆信息(客户车辆)*/
    private String Pub_SaveCar;
    /**保存客户信息*/
    private String Pub_SaveClient;
    /**维修接待作废*/
    private String RP_DelReception;
    /**维修进度*/
    private String RP_ProgressList;
    /**新建单据*/
    private String RP_ReceptionNew;
    /**保存维修接待*/
    private String RP_ReceptionSave;
    /**维修方式*/
    private String RP_RepaireType;
    /**维修接待列表*/
    private String RP_ShowReception;
    /**业务类别*/
    private String RP_TrafficClass;
    /**销售洽谈(新建)*/
    private String SC_NewNegotiate;
    /**整车销售订单(新建)*/
    private String SC_NewPurchase;
    /**保存车辆信息(整车)*/
    private String  SC_SaveCarInfo;
    /**销售洽谈(保存)*/
    private String  SC_SaveNegotiate;
    /**整车销售订单(保存)*/
    private String SC_SavePurchase;
    /**保存配件销售单*/
    private String SC_SaveSaleFixings;
    /**商品累计进货统计*/
    private String SP_ComAllIn;
    /**累计商品销售统计*/
    private String SP_ComAllSale;
    /**商品进货月分析*/
    private String SP_MonthIn;
    /**月销售分析*/
    private String SP_MonthSala;
    /**签到*/
    private String SignIn;
    /**客户销售额排行*/
    private String XS_ClientSalesVolume;
    /**日期销售报表*/
    private String XS_DateSale;
    /**营业额统计*/
    private String XS_OperatingAmount;
    /**销售计划分析表*/
    private String XS_SaleProject;
    /**仓库销售排行*/
    private String XS_StockSale;
    /**车辆销售统计*/
    private String ZC_CarSale;
    /**销售人员业绩统计*/
    private String ZC_SalesPerformance;
    /**客户账务统计*/
    private String ZH_CustomerAccounts;
    /**老板信息中心*/
    private String ZH_InfoForBoss;
    /**库存统计*/
    private String ZH_Inventory;
    /**经营统计*/
    private String ZH_Operation;
    /**收款统计*/
    private String ZH_Payment;
    /**维修统计*/
    private String ZH_Repair;
    /**人员回款统计*/
    private String ZY_BackPayment;
    /**员工销售排行*/
    private String ZY_StaffSale;

    private InterfaceParam(){
    }

    public static InterfaceParam getInstance() {
        if(param==null){
            param = new InterfaceParam();
        }
        return param;
    }

    /**预约维修列表*/
    public String getAP_AppointmentList() {
        AP_AppointmentList ="<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Header>\n" +
                "    <MySoapHeader xmlns=\"LDBM4S\">\n" +
                "      <UserName>@sysUser</UserName>\n" +
                "      <PassWord>@sysPassword</PassWord>\n" +
                "    </MySoapHeader>\n" +
                "  </soap:Header>\n" +
                "  <soap:Body>\n" +
                "    <AP_AppointmentList xmlns=\"LDBM4S\" />\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>";
        AP_AppointmentList = AP_AppointmentList.replace("@sysUser",SYS_USER);
        AP_AppointmentList = AP_AppointmentList.replace("@sysPassword",SYS_PASSWORD);
        return AP_AppointmentList;
    }
    /**保存预约维修*/
    public String getAP_AppointmentSave(String number, String info) {

        AP_AppointmentSave="<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Header>\n" +
                "    <MySoapHeader xmlns=\"LDBM4S\">\n" +
                "      <UserName>@sysUser</UserName>\n" +
                "      <PassWord>@sysPassword</PassWord>\n" +
                "    </MySoapHeader>\n" +
                "  </soap:Header>\n" +
                "  <soap:Body>\n" +
                "    <AP_AppointmentSave xmlns=\"LDBM4S\">\n" +
                "      <Number>@number</Number>\n" +
                "      <Info>@info</Info>\n" +
                "    </AP_AppointmentSave>\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>";
        AP_AppointmentSave = AP_AppointmentSave.replace("@sysUser",SYS_USER);
        AP_AppointmentSave = AP_AppointmentSave.replace("@sysPassword",SYS_PASSWORD);
        AP_AppointmentSave = AP_AppointmentSave.replace("@number",number);
        AP_AppointmentSave = AP_AppointmentSave.replace("@info",info);
        return AP_AppointmentSave;
    }
    /**库存成本异常*/
    public String getBJ_InventoryCost() {
        return BJ_InventoryCost;
    }
    /**负库存报警*/
    public String getBJ_NegativeInventory() {
        return BJ_NegativeInventory;
    }
    /**库存配件缺货报警*/
    public String getBJ_OutofStock() {
        return BJ_OutofStock;
    }
    /**采购订单分析*/
    public String getJH_BuyProject() {
        return JH_BuyProject;
    }
    /**进货汇总表*/
    public String getJH_Restock() {
        return JH_Restock;
    }
    /**供应商累计供货排行*/
    public String getJH_Supply() {
        return JH_Supply;
    }
    /**登陆*/
    public String getLogin(String userName,String passWord) {
        Login =  "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">" +
                "  <soap:Header>" +
                "    <MySoapHeader xmlns=\"LDBM4S\">" +
                "      <UserName>@sysUser</UserName>" +
                "      <PassWord>@sysPassword</PassWord>" +
                "    </MySoapHeader>" +
                "  </soap:Header>" +
                "  <soap:Body>" +
                "    <Login xmlns=\"LDBM4S\">" +
                "      <UName>@userName</UName>" +
                "      <Pwd>@passWord</Pwd>" +
                "    </Login>" +
                "  </soap:Body>" +
                "</soap:Envelope>";
        Login = Login.replace("@sysUser",SYS_USER);
        Login = Login.replace("@sysPassword",SYS_PASSWORD);
        Login = Login.replace("@userName",userName);
        Login = Login.replace("@passWord",passWord);
        return Login;
    }
    /**修改密码*/
    public String getModifyPassword() {
        return ModifyPassword;
    }
    /**配件品牌列表*/
    public String getPT_BrandList() {
        return PT_BrandList;
    }
    /**配件车型列表*/
    public String getPT_CarTypeList() {
        return PT_CarTypeList;
    }
    /**配件信息列表*/
    public String getPT_FixingsList(String page) {
        PT_FixingsList = "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Header>\n" +
                "    <MySoapHeader xmlns=\"LDBM4S\">\n" +
                "      <UserName>@sysUser</UserName>\n" +
                "      <PassWord>@sysPassword</PassWord>\n" +
                "    </MySoapHeader>\n" +
                "  </soap:Header>\n" +
                "  <soap:Body>\n" +
                "    <PT_FixingsList xmlns=\"LDBM4S\">\n" +
                "      <i>@page</i>\n" +
                "    </PT_FixingsList>\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>";
        PT_FixingsList = PT_FixingsList.replace("@sysUser",SYS_USER);
        PT_FixingsList = PT_FixingsList.replace("@sysPassword",SYS_PASSWORD);
        PT_FixingsList = PT_FixingsList.replace("@page",page);
        return PT_FixingsList;
    }
    /**配件类型*/
    public String getPT_FixingsTypeList() {
        return PT_FixingsTypeList;
    }
    /**配件仓库列表*/
    public String getPT_FixingsWarehouseList(String userName) {
        PT_FixingsWarehouseList="<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Header>\n" +
                "    <MySoapHeader xmlns=\"LDBM4S\">\n" +
                "      <UserName>@sysUser</UserName>\n" +
                "      <PassWord>@sysPassword</PassWord>\n" +
                "    </MySoapHeader>\n" +
                "  </soap:Header>\n" +
                "  <soap:Body>\n" +
                "    <PT_FixingsWarehouseList xmlns=\"LDBM4S\">\n" +
                "      <UName>@userName</UName>\n" +
                "    </PT_FixingsWarehouseList>\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>";
        PT_FixingsWarehouseList = PT_FixingsWarehouseList.replace("@sysUser",SYS_USER);
        PT_FixingsWarehouseList = PT_FixingsWarehouseList.replace("@sysPassword",SYS_PASSWORD);
        PT_FixingsWarehouseList = PT_FixingsWarehouseList.replace("@userName",userName);
        return PT_FixingsWarehouseList;
    }
    /**将采购计划单导入采购单*/
    public String getPT_ImportPurchaseInfo() {
        return PT_ImportPurchaseInfo;
    }
    /**保存新配件信息*/
    public String getPT_NewFixings() {
        return PT_NewFixings;
    }
    /**配件采购单（新建）*/
    public String getPT_NewPurchaseFixings(String userName) {
        PT_NewPurchaseFixings = "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Header>\n" +
                "    <MySoapHeader xmlns=\"LDBM4S\">\n" +
                "      <UserName>@sysUser</UserName>\n" +
                "      <PassWord>@sysPassword</PassWord>\n" +
                "    </MySoapHeader>\n" +
                "  </soap:Header>\n" +
                "  <soap:Body>\n" +
                "    <PT_NewPurchaseFixings xmlns=\"LDBM4S\">\n" +
                "      <UName>@userName</UName>\n" +
                "    </PT_NewPurchaseFixings>\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>";
        PT_NewPurchaseFixings = PT_NewPurchaseFixings.replace("@sysUser",SYS_USER);
        PT_NewPurchaseFixings = PT_NewPurchaseFixings.replace("@sysPassword",SYS_PASSWORD);
        PT_NewPurchaseFixings = PT_NewPurchaseFixings.replace("@userName",userName);
        return PT_NewPurchaseFixings;
    }
    /**新建配件销售单*/
    public String getPT_NewSaleFixings(String userName) {
        PT_NewSaleFixings="<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Header>\n" +
                "    <MySoapHeader xmlns=\"LDBM4S\">\n" +
                "      <UserName>@sysUser</UserName>\n" +
                "      <PassWord>@sysPassword</PassWord>\n" +
                "    </MySoapHeader>\n" +
                "  </soap:Header>\n" +
                "  <soap:Body>\n" +
                "    <PT_NewSaleFixings xmlns=\"LDBM4S\">\n" +
                "      <UName>@userName</UName>\n" +
                "    </PT_NewSaleFixings>\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>";
        PT_NewSaleFixings = PT_NewSaleFixings.replace("@sysUser",SYS_USER);
        PT_NewSaleFixings = PT_NewSaleFixings.replace("@sysPassword",SYS_PASSWORD);
        PT_NewSaleFixings = PT_NewSaleFixings.replace("@userName",userName);
        return PT_NewSaleFixings;
    }
    /**采购计划单列表*/
    public String getPT_PlanList() {
        return PT_PlanList;
    }
    /**配件采购单（保存）*/
    public String getPT_SavePurchaseFixings( String number,String info, String fInfo) {
        PT_SavePurchaseFixings = "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Header>\n" +
                "    <MySoapHeader xmlns=\"LDBM4S\">\n" +
                "      <UserName>@sysUser</UserName>\n" +
                "      <PassWord>@sysPassword</PassWord>\n" +
                "    </MySoapHeader>\n" +
                "  </soap:Header>\n" +
                "  <soap:Body>\n" +
                "    <PT_SavePurchaseFixings xmlns=\"LDBM4S\">\n" +
                "      <info>@info</info>\n" +
                "      <Number>@number</Number>\n" +
                "      <finfo>@fInfo</finfo>\n" +
                "    </PT_SavePurchaseFixings>\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>";
        PT_SavePurchaseFixings = PT_SavePurchaseFixings.replace("@sysUser",SYS_USER);
        PT_SavePurchaseFixings = PT_SavePurchaseFixings.replace("@sysPassword",SYS_PASSWORD);
        PT_SavePurchaseFixings = PT_SavePurchaseFixings.replace("@info",info);
        PT_SavePurchaseFixings = PT_SavePurchaseFixings.replace("@number",number);
        PT_SavePurchaseFixings = PT_SavePurchaseFixings.replace("@fInfo",fInfo);
        return PT_SavePurchaseFixings;
    }
    /**权限信息*/
    public String getPowerInfo() {
        return PowerInfo;
    }
    /**客户类型列表*/
    public String getPubClientTypeList(String clientType) {
        PubClientTypeList="<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Header>\n" +
                "    <MySoapHeader xmlns=\"LDBM4S\">\n" +
                "      <UserName>@sysUser</UserName>\n" +
                "      <PassWord>@sysPassword</PassWord>\n" +
                "    </MySoapHeader>\n" +
                "  </soap:Header>\n" +
                "  <soap:Body>\n" +
                "    <PubClientTypeList xmlns=\"LDBM4S\">\n" +
                "      <ClientType>@clientType</ClientType>\n" +
                "    </PubClientTypeList>\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>";
        PubClientTypeList = PubClientTypeList.replace("@sysUser",SYS_USER);
        PubClientTypeList = PubClientTypeList.replace("@sysPassword",SYS_PASSWORD);
        PubClientTypeList = PubClientTypeList.replace("@clientType",clientType);
        return PubClientTypeList;
    }
    /**车辆信息列表*/
    public String getPub_CarCode() {
        Pub_CarCode = "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Header>\n" +
                "    <MySoapHeader xmlns=\"LDBM4S\">\n" +
                "      <UserName>@sysUser</UserName>\n" +
                "      <PassWord>@sysPassword</PassWord>\n" +
                "    </MySoapHeader>\n" +
                "  </soap:Header>\n" +
                "  <soap:Body>\n" +
                "    <Pub_CarCode xmlns=\"LDBM4S\" />\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>";
        Pub_CarCode = Pub_CarCode.replace("@sysUser",SYS_USER);
        Pub_CarCode = Pub_CarCode.replace("@sysPassword",SYS_PASSWORD);
        return Pub_CarCode;
    }
    /**车辆颜色列表*/
    public String getPub_CarColorList() {
        Pub_CarColorList = "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Header>\n" +
                "    <MySoapHeader xmlns=\"LDBM4S\">\n" +
                "      <UserName>@sysUser</UserName>\n" +
                "      <PassWord>@sysPassword</PassWord>\n" +
                "    </MySoapHeader>\n" +
                "  </soap:Header>\n" +
                "  <soap:Body>\n" +
                "    <Pub_CarColorList xmlns=\"LDBM4S\" />\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>";
        Pub_CarColorList = Pub_CarColorList.replace("@sysUser",SYS_USER);
        Pub_CarColorList = Pub_CarColorList.replace("@sysPassword",SYS_PASSWORD);
        return Pub_CarColorList;
    }
    /**在库车辆*/
    public String getPub_CarList() {
        Pub_CarList = "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Header>\n" +
                "    <MySoapHeader xmlns=\"LDBM4S\">\n" +
                "      <UserName>@sysUser</UserName>\n" +
                "      <PassWord>@sysPassword</PassWord>\n" +
                "    </MySoapHeader>\n" +
                "  </soap:Header>\n" +
                "  <soap:Body>\n" +
                "    <Pub_CarList xmlns=\"LDBM4S\" />\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>";
        Pub_CarList = Pub_CarList.replace("@sysUser",SYS_USER);
        Pub_CarList = Pub_CarList.replace("@sysPassword",SYS_PASSWORD);
        return Pub_CarList;
    }
    /**车型列表*/
    public String getPub_CarTypeList() {
        Pub_CarTypeList="<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Header>\n" +
                "    <MySoapHeader xmlns=\"LDBM4S\">\n" +
                "      <UserName>@sysUser</UserName>\n" +
                "      <PassWord>@sysPassword</PassWord>\n" +
                "    </MySoapHeader>\n" +
                "  </soap:Header>\n" +
                "  <soap:Body>\n" +
                "    <Pub_CarTypeList xmlns=\"LDBM4S\" />\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>";
        Pub_CarTypeList = Pub_CarTypeList.replace("@sysUser",SYS_USER);
        Pub_CarTypeList = Pub_CarTypeList.replace("@sysPassword",SYS_PASSWORD);
        return Pub_CarTypeList;
    }
    /**整车仓库列表*/
    public String getPub_CarWarehouseList() {
        Pub_CarWarehouseList = "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Header>\n" +
                "    <MySoapHeader xmlns=\"LDBM4S\">\n" +
                "      <UserName>@sysUser</UserName>\n" +
                "      <PassWord>@sysPassword</PassWord>\n" +
                "    </MySoapHeader>\n" +
                "  </soap:Header>\n" +
                "  <soap:Body>\n" +
                "    <Pub_CarWarehouseList xmlns=\"LDBM4S\" />\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>";
        Pub_CarWarehouseList = Pub_CarWarehouseList.replace("@sysUser",SYS_USER);
        Pub_CarWarehouseList = Pub_CarWarehouseList.replace("@sysPassword",SYS_PASSWORD);
        return Pub_CarWarehouseList;
    }
    /**客户信息列表*/
    public String getPub_ClientList() {
        Pub_ClientList="<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Header>\n" +
                "    <MySoapHeader xmlns=\"LDBM4S\">\n" +
                "      <UserName>@sysUser</UserName>\n" +
                "      <PassWord>@sysPassword</PassWord>\n" +
                "    </MySoapHeader>\n" +
                "  </soap:Header>\n" +
                "  <soap:Body>\n" +
                "    <Pub_ClientList xmlns=\"LDBM4S\" />\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>";
        Pub_ClientList = Pub_ClientList.replace("@sysUser",SYS_USER);
        Pub_ClientList = Pub_ClientList.replace("@sysPassword",SYS_PASSWORD);
        return Pub_ClientList;
    }
    /**发票信息*/
    public String getPub_InvoiceList() {
        Pub_InvoiceList = "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Header>\n" +
                "    <MySoapHeader xmlns=\"LDBM4S\">\n" +
                "      <UserName>@sysUser</UserName>\n" +
                "      <PassWord>@sysPassword</PassWord>\n" +
                "    </MySoapHeader>\n" +
                "  </soap:Header>\n" +
                "  <soap:Body>\n" +
                "    <Pub_InvoiceList xmlns=\"LDBM4S\" />\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>";
        Pub_InvoiceList = Pub_InvoiceList.replace("@sysUser",SYS_USER);
        Pub_InvoiceList = Pub_InvoiceList.replace("@sysPassword",SYS_PASSWORD);
        return Pub_InvoiceList;
    }
    /**修改客户信息*/
    public String getPub_ModifyClientInfo() {
        return Pub_ModifyClientInfo;
    }
    /**修改配件信息*/
    public String getPub_ModifyFixingtInfo() {
        return Pub_ModifyFixingtInfo;
    }
    /**经手人信息列表*/
    public String getPub_Salesman() {
        Pub_Salesman = "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Header>\n" +
                "    <MySoapHeader xmlns=\"LDBM4S\">\n" +
                "      <UserName>@sysUser</UserName>\n" +
                "      <PassWord>@sysPassword</PassWord>\n" +
                "    </MySoapHeader>\n" +
                "  </soap:Header>\n" +
                "  <soap:Body>\n" +
                "    <Pub_Salesman xmlns=\"LDBM4S\" />\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>";
        Pub_Salesman = Pub_Salesman.replace("@sysUser",SYS_USER);
        Pub_Salesman = Pub_Salesman.replace("@sysPassword",SYS_PASSWORD);
        return Pub_Salesman;
    }
    /**保存车辆信息(客户车辆)*/
    public String getPub_SaveCar(String CarCode, String ClientCode ,String CarType) {
        Pub_SaveCar="<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Header>\n" +
                "    <MySoapHeader xmlns=\"LDBM4S\">\n" +
                "      <UserName>@sysUser</UserName>\n" +
                "      <PassWord>@sysPassword</PassWord>\n" +
                "    </MySoapHeader>\n" +
                "  </soap:Header>\n" +
                "  <soap:Body>\n" +
                "    <Pub_SaveCar xmlns=\"LDBM4S\">\n" +
                "      <CarCode>@CarCode</CarCode>\n" +
                "      <ClientCode>@ClientCode</ClientCode>\n" +
                "      <CarType>@CarType</CarType>\n" +
                "    </Pub_SaveCar>\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>";
        Pub_SaveCar = Pub_SaveCar.replace("@sysUser",SYS_USER);
        Pub_SaveCar = Pub_SaveCar.replace("@sysPassword",SYS_PASSWORD);
        Pub_SaveCar = Pub_SaveCar.replace("@CarCode",CarCode);
        Pub_SaveCar = Pub_SaveCar.replace("@ClientCode",ClientCode);
        Pub_SaveCar = Pub_SaveCar.replace("@CarType",CarType);
        return Pub_SaveCar;
    }
    /**保存客户信息*/
    public String getPub_SaveClient(String userName, String clientInfo) {
        Pub_SaveClient = "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Header>\n" +
                "    <MySoapHeader xmlns=\"LDBM4S\">\n" +
                "      <UserName>@sysUser</UserName>\n" +
                "      <PassWord>@sysPassword</PassWord>\n" +
                "    </MySoapHeader>\n" +
                "  </soap:Header>\n" +
                "  <soap:Body>\n" +
                "    <Pub_SaveClient xmlns=\"LDBM4S\">\n" +
                "      <UName>@userName</UName>\n" +
                "      <Info>@clientInfo</Info>\n" +
                "    </Pub_SaveClient>\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>";
        Pub_SaveClient = Pub_SaveClient.replace("@sysUser",SYS_USER);
        Pub_SaveClient = Pub_SaveClient.replace("@sysPassword",SYS_PASSWORD);
        Pub_SaveClient = Pub_SaveClient.replace("@userName",userName);
        Pub_SaveClient = Pub_SaveClient.replace("@clientInfo",clientInfo);
        return Pub_SaveClient;
    }
    /**维修接待作废*/
    public String getRP_DelReception() {
        return RP_DelReception;
    }
    /**维修进度*/
    public String getRP_ProgressList(String carCode) {
        RP_ProgressList = "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Header>\n" +
                "    <MySoapHeader xmlns=\"LDBM4S\">\n" +
                "      <UserName>@sysUser</UserName>\n" +
                "      <PassWord>@sysPassword</PassWord>\n" +
                "    </MySoapHeader>\n" +
                "  </soap:Header>\n" +
                "  <soap:Body>\n" +
                "    <RP_ProgressList xmlns=\"LDBM4S\">\n" +
                "      <CarCode>@carCode</CarCode>\n" +
                "    </RP_ProgressList>\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>";
        RP_ProgressList = RP_ProgressList.replace("@sysUser",SYS_USER);
        RP_ProgressList = RP_ProgressList.replace("@sysPassword",SYS_PASSWORD);
        RP_ProgressList = RP_ProgressList.replace("@carCode", carCode);
        return RP_ProgressList;
    }
    /**新建单据*/
    public String getRP_ReceptionNew(String type) {
        RP_ReceptionNew = "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Header>\n" +
                "    <MySoapHeader xmlns=\"LDBM4S\">\n" +
                "      <UserName>@sysUser</UserName>\n" +
                "      <PassWord>@sysPassword</PassWord>\n" +
                "    </MySoapHeader>\n" +
                "  </soap:Header>\n" +
                "  <soap:Body>\n" +
                "    <RP_ReceptionNew xmlns=\"LDBM4S\">\n" +
                "      <UName>@userName</UName>\n" +
                "      <Type>@type</Type>\n" +
                "    </RP_ReceptionNew>\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>";
        RP_ReceptionNew = RP_ReceptionNew.replace("@sysUser",SYS_USER);
        RP_ReceptionNew = RP_ReceptionNew.replace("@sysPassword",SYS_PASSWORD);
        RP_ReceptionNew = RP_ReceptionNew.replace("@userName", UserProperty.getInstance().getUserName());
        RP_ReceptionNew = RP_ReceptionNew.replace("@type",type);
        return RP_ReceptionNew;
    }
    /**保存维修接待*/
    public String getRP_ReceptionSave(String number, String info) {
        RP_ReceptionSave="<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Header>\n" +
                "    <MySoapHeader xmlns=\"LDBM4S\">\n" +
                "      <UserName>@sysUser</UserName>\n" +
                "      <PassWord>@sysPassword</PassWord>\n" +
                "    </MySoapHeader>\n" +
                "  </soap:Header>\n" +
                "  <soap:Body>\n" +
                "    <RP_ReceptionSave xmlns=\"LDBM4S\">\n" +
                "      <Number>@number</Number>\n" +
                "      <Info>@info</Info>\n" +
                "    </RP_ReceptionSave>\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>";
        RP_ReceptionSave = RP_ReceptionSave.replace("@sysUser",SYS_USER);
        RP_ReceptionSave = RP_ReceptionSave.replace("@sysPassword",SYS_PASSWORD);
        RP_ReceptionSave = RP_ReceptionSave.replace("@number",number);
        RP_ReceptionSave = RP_ReceptionSave.replace("@info",info);
        return RP_ReceptionSave;
    }
    /**维修方式*/
    public String getRP_RepaireType() {
        RP_RepaireType = "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Header>\n" +
                "    <MySoapHeader xmlns=\"LDBM4S\">\n" +
                "      <UserName>@sysUser</UserName>\n" +
                "      <PassWord>@sysPassword</PassWord>\n" +
                "    </MySoapHeader>\n" +
                "  </soap:Header>\n" +
                "  <soap:Body>\n" +
                "    <RP_RepaireType xmlns=\"LDBM4S\" />\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>";
        RP_RepaireType = RP_RepaireType.replace("@sysUser",SYS_USER);
        RP_RepaireType = RP_RepaireType.replace("@sysPassword",SYS_PASSWORD);
        return RP_RepaireType;
    }
    /**维修接待列表*/
    public String getRP_ShowReception() {
        RP_ShowReception="<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Header>\n" +
                "    <MySoapHeader xmlns=\"LDBM4S\">\n" +
                "      <UserName>@sysUser</UserName>\n" +
                "      <PassWord>@sysPassword</PassWord>\n" +
                "    </MySoapHeader>\n" +
                "  </soap:Header>\n" +
                "  <soap:Body>\n" +
                "    <RP_ShowReception xmlns=\"LDBM4S\" />\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>";
        RP_ShowReception = RP_ShowReception.replace("@sysUser",SYS_USER);
        RP_ShowReception = RP_ShowReception.replace("@sysPassword",SYS_PASSWORD);
        return RP_ShowReception;
    }
    /**业务类别*/
    public String getRP_TrafficClass() {
        RP_TrafficClass = "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Header>\n" +
                "    <MySoapHeader xmlns=\"LDBM4S\">\n" +
                "      <UserName>@sysUser</UserName>\n" +
                "      <PassWord>@sysPassword</PassWord>\n" +
                "    </MySoapHeader>\n" +
                "  </soap:Header>\n" +
                "  <soap:Body>\n" +
                "    <RP_TrafficClass xmlns=\"LDBM4S\" />\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>";
        RP_TrafficClass = RP_TrafficClass.replace("@sysUser",SYS_USER);
        RP_TrafficClass = RP_TrafficClass.replace("@sysPassword",SYS_PASSWORD);
        return RP_TrafficClass;
    }

    /**
     * 销售洽谈(新建)
     * @param type 类型：个人/公司
     * @return
     */
    public String getSC_NewNegotiate(String userName,String type) {
            SC_NewNegotiate = "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                    "  <soap:Header>\n" +
                    "    <MySoapHeader xmlns=\"LDBM4S\">\n" +
                    "      <UserName>@sysUser</UserName>\n" +
                    "      <PassWord>@sysPassword</PassWord>\n" +
                    "    </MySoapHeader>\n" +
                    "  </soap:Header>\n" +
                    "  <soap:Body>\n" +
                    "    <SC_NewNegotiate xmlns=\"LDBM4S\">\n" +
                    "      <UName>@userName</UName>\n" +
                    "      <ClientType>@type</ClientType>\n" +
                    "    </SC_NewNegotiate>\n" +
                    "  </soap:Body>\n" +
                    "</soap:Envelope>";
        SC_NewNegotiate = SC_NewNegotiate.replace("@sysUser",SYS_USER);
        SC_NewNegotiate = SC_NewNegotiate.replace("@sysPassword",SYS_PASSWORD);
        SC_NewNegotiate = SC_NewNegotiate.replace("@userName",userName);
        SC_NewNegotiate = SC_NewNegotiate.replace("@type",type);
        return SC_NewNegotiate;
    }
    /**整车销售订单(新建)*/
    public String getSC_NewPurchase(String userName) {
        SC_NewPurchase = "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Header>\n" +
                "    <MySoapHeader xmlns=\"LDBM4S\">\n" +
                "      <UserName>@sysUser</UserName>\n" +
                "      <PassWord>@sysPassword</PassWord>\n" +
                "    </MySoapHeader>\n" +
                "  </soap:Header>\n" +
                "  <soap:Body>\n" +
                "    <SC_NewPurchase xmlns=\"LDBM4S\">\n" +
                "      <UName>@userName</UName>\n" +
                "    </SC_NewPurchase>\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>";
        SC_NewPurchase = SC_NewPurchase.replace("@sysUser",SYS_USER);
        SC_NewPurchase = SC_NewPurchase.replace("@sysPassword",SYS_PASSWORD);
        SC_NewPurchase = SC_NewPurchase.replace("@userName",userName);
        return SC_NewPurchase;
    }
    /**保存车辆信息(整车)*/
    public String getSC_SaveCarInfo() {
        return SC_SaveCarInfo;
    }
    /**销售洽谈(保存)*/
    public String getSC_SaveNegotiate(String userName,String info,String type) {
        SC_SaveNegotiate="<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Header>\n" +
                "    <MySoapHeader xmlns=\"LDBM4S\">\n" +
                "      <UserName>@sysUser</UserName>\n" +
                "      <PassWord>@sysPassword</PassWord>\n" +
                "    </MySoapHeader>\n" +
                "  </soap:Header>\n" +
                "  <soap:Body>\n" +
                "    <SC_SaveNegotiate xmlns=\"LDBM4S\">\n" +
                "      <UName>@userName</UName>\n" +
                "      <Info>@info</Info>\n" +
                "      <ClientType>@type</ClientType>\n" +
                "    </SC_SaveNegotiate>\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>";
        SC_SaveNegotiate = SC_SaveNegotiate.replace("@sysUser",SYS_USER);
        SC_SaveNegotiate = SC_SaveNegotiate.replace("@sysPassword",SYS_PASSWORD);
        SC_SaveNegotiate = SC_SaveNegotiate.replace("@userName",userName);
        SC_SaveNegotiate = SC_SaveNegotiate.replace("@info",info);
        SC_SaveNegotiate = SC_SaveNegotiate.replace("@type",type);
        return SC_SaveNegotiate;
    }
    /**整车销售订单(保存)*/
    public String getSC_SavePurchase(String number, String pInfo, String cInfo) {
        SC_SavePurchase="<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Header>\n" +
                "    <MySoapHeader xmlns=\"LDBM4S\">\n" +
                "      <UserName>@sysUser</UserName>\n" +
                "      <PassWord>@sysPassword</PassWord>\n" +
                "    </MySoapHeader>\n" +
                "  </soap:Header>\n" +
                "  <soap:Body>\n" +
                "    <SC_SavePurchase xmlns=\"LDBM4S\">\n" +
                "      <Number>@number</Number>\n" +
                "      <pInfo>@pInfo</pInfo>\n" +
                "      <cInfo>@cInfo</cInfo>\n" +
                "    </SC_SavePurchase>\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>";
        SC_SavePurchase = SC_SavePurchase.replace("@sysUser",SYS_USER);
        SC_SavePurchase = SC_SavePurchase.replace("@sysPassword",SYS_PASSWORD);
        SC_SavePurchase = SC_SavePurchase.replace("@number",number);
        SC_SavePurchase = SC_SavePurchase.replace("@pInfo",pInfo);
        SC_SavePurchase = SC_SavePurchase.replace("@cInfo",cInfo);
        return SC_SavePurchase;
    }
    /**保存配件销售单*/
    public String getSC_SaveSaleFixings(String number,String info,String fInfo) {
        SC_SaveSaleFixings= "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Header>\n" +
                "    <MySoapHeader xmlns=\"LDBM4S\">\n" +
                "      <UserName>@sysUser</UserName>\n" +
                "      <PassWord>@sysPassword</PassWord>\n" +
                "    </MySoapHeader>\n" +
                "  </soap:Header>\n" +
                "  <soap:Body>\n" +
                "    <SC_SaveSaleFixings xmlns=\"LDBM4S\">\n" +
                "      <info>@info</info>\n" +
                "      <Number>@number</Number>\n" +
                "      <finfo>@fInfo</finfo>\n" +
                "    </SC_SaveSaleFixings>\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>";
        SC_SaveSaleFixings = SC_SaveSaleFixings.replace("@sysUser",SYS_USER);
        SC_SaveSaleFixings = SC_SaveSaleFixings.replace("@sysPassword",SYS_PASSWORD);
        SC_SaveSaleFixings = SC_SaveSaleFixings.replace("@info",info);
        SC_SaveSaleFixings = SC_SaveSaleFixings.replace("@number",number);
        SC_SaveSaleFixings = SC_SaveSaleFixings.replace("@fInfo",fInfo);
        return SC_SaveSaleFixings;
    }
    /**商品累计进货统计*/
    public String getSP_ComAllIn() {
        return SP_ComAllIn;
    }
    /**累计商品销售统计*/
    public String getSP_ComAllSale() {
        return SP_ComAllSale;
    }
    /**商品进货月分析*/
    public String getSP_MonthIn() {
        return SP_MonthIn;
    }
    /**月销售分析*/
    public String getSP_MonthSala() {
        return SP_MonthSala;
    }
    /**签到*/
    public String getSignIn() {
        return SignIn;
    }
    /**客户销售额排行*/
    public String getXS_ClientSalesVolume() {
        return XS_ClientSalesVolume;
    }
    /**日期销售报表*/
    public String getXS_DateSale() {
        return XS_DateSale;
    }
    /**营业额统计*/
    public String getXS_OperatingAmount() {
        return XS_OperatingAmount;
    }
    /**销售计划分析表*/
    public String getXS_SaleProject() {
        return XS_SaleProject;
    }
    /**仓库销售排行*/
    public String getXS_StockSale() {
        return XS_StockSale;
    }
    /**车辆销售统计*/
    public String getZC_CarSale() {
        return ZC_CarSale;
    }
    /**销售人员业绩统计*/
    public String getZC_SalesPerformance() {
        return ZC_SalesPerformance;
    }
    /**客户账务统计*/
    public String getZH_CustomerAccounts() {
        return ZH_CustomerAccounts;
    }
    /**老板信息中心*/
    public String getZH_InfoForBoss() {
        return ZH_InfoForBoss;
    }
    /**库存统计*/
    public String getZH_Inventory() {
        return ZH_Inventory;
    }
    /**经营统计*/
    public String getZH_Operation() {
        return ZH_Operation;
    }
    /**收款统计*/
    public String getZH_Payment() {
        return ZH_Payment;
    }
    /**维修统计*/
    public String getZH_Repair() {
        return ZH_Repair;
    }
    /**人员回款统计*/
    public String getZY_BackPayment() {
        return ZY_BackPayment;
    }
    /**员工销售排行*/
    public String getZY_StaffSale() {
        return ZY_StaffSale;
    }


}
