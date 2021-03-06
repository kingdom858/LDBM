package com.ldedusoft.ldbm.model;

import java.util.ArrayList;

/**
 * Created by wangjianwei on 2016/6/23.
 */
public class SysProperty {

    private static SysProperty sysp;

    /*登录模式*/
    private String mode;

    /*全部菜单*/
    private ArrayList<MenuItem> AllMenuList;

    /*首页列表*/
    private ArrayList<MenuItem> homeMenuList;

    /*维修页面菜单列表*/
    private ArrayList<MenuItem> repairMenuList;

    /*配件页面菜单*/
    private ArrayList<MenuItem> partMenuList;

    /*整车页面菜单*/
    private ArrayList<MenuItem> carMenuList;

    /*洽谈页面菜单*/
    private ArrayList<MenuItem> negotiateMenuList;

    public ArrayList<MenuItem> getNegotiateMenuList() {
        return negotiateMenuList;
    }

    public void setNegotiateMenuList(ArrayList<MenuItem> negotiateMenuList) {
        this.negotiateMenuList = negotiateMenuList;
    }

    public ArrayList<MenuItem> getAllMenuList() {
        return AllMenuList;
    }

    public void setAllMenuList(ArrayList<MenuItem> allMenuList) {
        AllMenuList = allMenuList;
    }

    public ArrayList<MenuItem> getPartMenuList() {
        return partMenuList;
    }

    public void setPartMenuList(ArrayList<MenuItem> partMenuList) {
        this.partMenuList = partMenuList;
    }

    public ArrayList<MenuItem> getCarMenuList() {
        return carMenuList;
    }

    public void setCarMenuList(ArrayList<MenuItem> carMenuList) {
        this.carMenuList = carMenuList;
    }

    public ArrayList<MenuItem> getRepairMenuList() {
        return repairMenuList;
    }

    public void setRepairMenuList(ArrayList<MenuItem> repairMenuList) {
        this.repairMenuList = repairMenuList;
    }

    private SysProperty(){}

    public static SysProperty getInstance(){
        if(sysp == null){
            sysp = new SysProperty();
        }
        return sysp;
    }

    public ArrayList<MenuItem> getHomeMenuList() {
        return homeMenuList;
    }

    public void setHomeMenuList(ArrayList<MenuItem> homeMenuList) {
        this.homeMenuList = homeMenuList;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
