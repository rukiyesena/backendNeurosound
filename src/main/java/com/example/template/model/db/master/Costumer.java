package com.example.template.model.db.master;

import com.example.template.model.db.RefObject;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Costumer extends RefObject {
    private String cosTitle;
    private String auth;
    private String phone1;
    private String phone2;
    private String taxCode;
    private String taxOffice;
    private String province;
    private String district;
    private String adress;
    private String explanation;

    public Costumer(String cosTitle, String auth, String phone1, String phone2, String taxCode, String taxOffice, String province, String district, String adress, String explanation) {
        this.cosTitle = cosTitle;
        this.auth = auth;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.taxCode = taxCode;
        this.taxOffice = taxOffice;
        this.province = province;
        this.district = district;
        this.adress = adress;
        this.explanation = explanation;
    }

    public Costumer() {

    }

    public String getCosTitle() {
        return cosTitle;
    }

    public void setCosTitle(String cosTitle) {
        this.cosTitle = cosTitle;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getTaxOffice() {
        return taxOffice;
    }

    public void setTaxOffice(String taxOffice) {
        this.taxOffice = taxOffice;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }
}
