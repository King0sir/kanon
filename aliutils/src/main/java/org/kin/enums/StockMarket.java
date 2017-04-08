package org.kin.enums;

/**
 * Created by kinakihiro on 2017/4/8.
 */
public enum StockMarket {
    ShangHai("sh","沪市"),
    ShenZhen("sz","深市"),
    HongKong("hk","港股");

    private String code;

    private String name;

    StockMarket(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
