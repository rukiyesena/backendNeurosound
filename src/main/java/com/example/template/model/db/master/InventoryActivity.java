package com.example.template.model.db.master;

import com.example.template.model.db.RefObject;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class InventoryActivity extends RefObject {
    private String activityTime;
    private String activityDate;
    private String activityCustom;
    private String activityStation;

    public InventoryActivity(String activityTime, String activityDate, String activityCustom, String activityStation) {
        this.activityTime = activityTime;
        this.activityDate = activityDate;
        this.activityCustom = activityCustom;
        this.activityStation = activityStation;
    }

    public InventoryActivity() {

    }

    public String getActivityTime() {
        return activityTime;
    }

    public void setActivityTime(String activityTime) {
        this.activityTime = activityTime;
    }

    public String getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(String activityDate) {
        this.activityDate = activityDate;
    }

    public String getActivityCustom() {
        return activityCustom;
    }

    public void setActivityCustom(String activityCustom) {
        this.activityCustom = activityCustom;
    }

    public String getActivityStation() {
        return activityStation;
    }

    public void setActivityStation(String activityStation) {
        this.activityStation = activityStation;
    }
}
