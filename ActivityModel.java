package com.example.to_do_list;

import java.util.Calendar;

public class ActivityModel {
    int id;
    String activityInfo;
    boolean status;

    public ActivityModel(String activityInfo,  boolean status) {
        this.activityInfo = activityInfo;
        this.status = status;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public String getActivityInfo() {
        return activityInfo;
    }

    public boolean getStaus() {
        return status;
    }

    public void setActivityInfo(String activityInfo) {
        this.activityInfo = activityInfo;
    }

    public void setStaus(boolean staus) {
        this.status = staus;
    }


}
