package com.ai.psims.web.model;

import java.util.Date;

public class SystemParameter {
    private Integer paramId;

    private String pKey;

    private String pDesc;

    private String pValue;

    private String ppKey;

    private String ppDesc;

    private String ppValue;

    private String pRemark;

    private Date pCreatetime;

    private String pParentid;

    public Integer getParamId() {
        return paramId;
    }

    public void setParamId(Integer paramId) {
        this.paramId = paramId;
    }

    public String getpKey() {
        return pKey;
    }

    public void setpKey(String pKey) {
        this.pKey = pKey == null ? null : pKey.trim();
    }

    public String getpDesc() {
        return pDesc;
    }

    public void setpDesc(String pDesc) {
        this.pDesc = pDesc == null ? null : pDesc.trim();
    }

    public String getpValue() {
        return pValue;
    }

    public void setpValue(String pValue) {
        this.pValue = pValue == null ? null : pValue.trim();
    }

    public String getPpKey() {
        return ppKey;
    }

    public void setPpKey(String ppKey) {
        this.ppKey = ppKey == null ? null : ppKey.trim();
    }

    public String getPpDesc() {
        return ppDesc;
    }

    public void setPpDesc(String ppDesc) {
        this.ppDesc = ppDesc == null ? null : ppDesc.trim();
    }

    public String getPpValue() {
        return ppValue;
    }

    public void setPpValue(String ppValue) {
        this.ppValue = ppValue == null ? null : ppValue.trim();
    }

    public String getpRemark() {
        return pRemark;
    }

    public void setpRemark(String pRemark) {
        this.pRemark = pRemark == null ? null : pRemark.trim();
    }

    public Date getpCreatetime() {
        return pCreatetime;
    }

    public void setpCreatetime(Date pCreatetime) {
        this.pCreatetime = pCreatetime;
    }

    public String getpParentid() {
        return pParentid;
    }

    public void setpParentid(String pParentid) {
        this.pParentid = pParentid == null ? null : pParentid.trim();
    }
}