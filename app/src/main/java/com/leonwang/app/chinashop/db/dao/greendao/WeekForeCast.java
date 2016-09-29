package com.leonwang.app.chinashop.db.dao.greendao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "WEEK_FORE_CAST".
 */
public class WeekForeCast {

    private String areaid;
    private java.util.Date weatherDate;
    private String weatherConditionStart;
    private String weatherConditionEnd;
    private Integer tempH;
    private Integer tempL;
    private String fx;
    private String fj;
    private Integer rainPerCent;

    public WeekForeCast() {
    }

    public WeekForeCast(String areaid, java.util.Date weatherDate, String weatherConditionStart, String weatherConditionEnd, Integer tempH, Integer tempL, String fx, String fj, Integer rainPerCent) {
        this.areaid = areaid;
        this.weatherDate = weatherDate;
        this.weatherConditionStart = weatherConditionStart;
        this.weatherConditionEnd = weatherConditionEnd;
        this.tempH = tempH;
        this.tempL = tempL;
        this.fx = fx;
        this.fj = fj;
        this.rainPerCent = rainPerCent;
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid;
    }

    public java.util.Date getWeatherDate() {
        return weatherDate;
    }

    public void setWeatherDate(java.util.Date weatherDate) {
        this.weatherDate = weatherDate;
    }

    public String getWeatherConditionStart() {
        return weatherConditionStart;
    }

    public void setWeatherConditionStart(String weatherConditionStart) {
        this.weatherConditionStart = weatherConditionStart;
    }

    public String getWeatherConditionEnd() {
        return weatherConditionEnd;
    }

    public void setWeatherConditionEnd(String weatherConditionEnd) {
        this.weatherConditionEnd = weatherConditionEnd;
    }

    public Integer getTempH() {
        return tempH;
    }

    public void setTempH(Integer tempH) {
        this.tempH = tempH;
    }

    public Integer getTempL() {
        return tempL;
    }

    public void setTempL(Integer tempL) {
        this.tempL = tempL;
    }

    public String getFx() {
        return fx;
    }

    public void setFx(String fx) {
        this.fx = fx;
    }

    public String getFj() {
        return fj;
    }

    public void setFj(String fj) {
        this.fj = fj;
    }

    public Integer getRainPerCent() {
        return rainPerCent;
    }

    public void setRainPerCent(Integer rainPerCent) {
        this.rainPerCent = rainPerCent;
    }

}
