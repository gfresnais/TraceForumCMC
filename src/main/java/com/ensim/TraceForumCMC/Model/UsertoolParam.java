package com.ensim.TraceForumCMC.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UsertoolParam {

    @Id
    private String iDParam;
    private String paramname1;
    private String paramvalue1;
    private String description1;
    private String paramname2;
    private String paramvalue2;
    private String description2;
    private String paramname3;
    private String paramvalue3;
    private String description3;
    private String paramname4;
    private String paramvalue4;
    private String description4;
    private String username;

    public String getIDParam() {
        return iDParam;
    }

    public void setIDParam(String iDParam) {
        this.iDParam = iDParam;
    }

    public String getParamname1() {
        return paramname1;
    }

    public void setParamname1(String paramname1) {
        this.paramname1 = paramname1;
    }

    public String getParamvalue1() {
        return paramvalue1;
    }

    public void setParamvalue1(String paramvalue1) {
        this.paramvalue1 = paramvalue1;
    }

    public String getDescription1() {
        return description1;
    }

    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    public String getParamname2() {
        return paramname2;
    }

    public void setParamname2(String paramname2) {
        this.paramname2 = paramname2;
    }

    public String getParamvalue2() {
        return paramvalue2;
    }

    public void setParamvalue2(String paramvalue2) {
        this.paramvalue2 = paramvalue2;
    }

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    public String getParamname3() {
        return paramname3;
    }

    public void setParamname3(String paramname3) {
        this.paramname3 = paramname3;
    }

    public String getParamvalue3() {
        return paramvalue3;
    }

    public void setParamvalue3(String paramvalue3) {
        this.paramvalue3 = paramvalue3;
    }

    public String getDescription3() {
        return description3;
    }

    public void setDescription3(String description3) {
        this.description3 = description3;
    }

    public String getParamname4() {
        return paramname4;
    }

    public void setParamname4(String paramname4) {
        this.paramname4 = paramname4;
    }

    public String getParamvalue4() {
        return paramvalue4;
    }

    public void setParamvalue4(String paramvalue4) {
        this.paramvalue4 = paramvalue4;
    }

    public String getDescription4() {
        return description4;
    }

    public void setDescription4(String description4) {
        this.description4 = description4;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
