package org.kin.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Stocks {
    private String code;

    private String market;

    private String name;

    private String pinyin;

    private BigDecimal currcapital;

    private BigDecimal totalcapital;

    private BigDecimal profitFour;

    private BigDecimal mgjzc;

    private Date listingDate;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public BigDecimal getCurrcapital() {
        return currcapital;
    }

    public void setCurrcapital(BigDecimal currcapital) {
        this.currcapital = currcapital;
    }

    public BigDecimal getTotalcapital() {
        return totalcapital;
    }

    public void setTotalcapital(BigDecimal totalcapital) {
        this.totalcapital = totalcapital;
    }

    public BigDecimal getProfitFour() {
        return profitFour;
    }

    public void setProfitFour(BigDecimal profitFour) {
        this.profitFour = profitFour;
    }

    public BigDecimal getMgjzc() {
        return mgjzc;
    }

    public void setMgjzc(BigDecimal mgjzc) {
        this.mgjzc = mgjzc;
    }

    public Date getListingDate() {
        return listingDate;
    }

    public void setListingDate(Date listingDate) {
        this.listingDate = listingDate;
    }
}