package com.vo;

import java.util.Date;

public class NcpView1 {
    private String ncpBasicId;
    private String ncpName;
    private String c1Name;
    private String c2Name;
    private String c3Name;
    private String pName;
    private String nameP;
    private String nameC;
    private String nameA;
    private String ncpFeature;
    private Date ncpPublishDate;

    public String getNcpBasicId() {
        return ncpBasicId;
    }

    public void setNcpBasicId(String ncpBasicId) {
        this.ncpBasicId = ncpBasicId;
    }

    public String getNcpName() {
        return ncpName;
    }

    public void setNcpName(String ncpName) {
        this.ncpName = ncpName;
    }

    public String getC1Name() {
        return c1Name;
    }

    public void setC1Name(String c1Name) {
        this.c1Name = c1Name;
    }

    public String getC2Name() {
        return c2Name;
    }

    public void setC2Name(String c2Name) {
        this.c2Name = c2Name;
    }

    public String getC3Name() {
        return c3Name;
    }

    public void setC3Name(String c3Name) {
        this.c3Name = c3Name;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getNameP() {
        return nameP;
    }

    public void setNameP(String nameP) {
        this.nameP = nameP;
    }

    public String getNameC() {
        return nameC;
    }

    public void setNameC(String nameC) {
        this.nameC = nameC;
    }

    public String getNameA() {
        return nameA;
    }

    public void setNameA(String nameA) {
        this.nameA = nameA;
    }

    public String getNcpFeature() {
        return ncpFeature;
    }

    public void setNcpFeature(String ncpFeature) {
        this.ncpFeature = ncpFeature;
    }

    public Date getNcpPublishDate() {
        return ncpPublishDate;
    }

    public void setNcpPublishDate(Date ncpPublishDate) {
        this.ncpPublishDate = ncpPublishDate;
    }

    @Override
    public String toString() {
        return "NcpView1{" +
                "ncpBasicId='" + ncpBasicId + '\'' +
                ", ncpName='" + ncpName + '\'' +
                ", c1Name='" + c1Name + '\'' +
                ", c2Name='" + c2Name + '\'' +
                ", c3Name='" + c3Name + '\'' +
                ", pName='" + pName + '\'' +
                ", nameP='" + nameP + '\'' +
                ", nameC='" + nameC + '\'' +
                ", nameA='" + nameA + '\'' +
                ", ncpFeature='" + ncpFeature + '\'' +
                ", ncpPublishDate=" + ncpPublishDate +
                '}';
    }
}
