package org.kin.enums;

/**
 * Created by kinakihiro on 2017/4/12.
 */
public enum KLineTime {

    FiveMin("5","5分k线"),
    Thirteen("30","30分k线"),
    Day("day","日k线"),
    Week("week","周k线"),
    Month("month","月k线");

    private String code;

    private String name;

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

    KLineTime(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public static KLineTime getKLineTime(String code){
        for(KLineTime type : values()){
            if(type.getCode().equals(code)){
                return type;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "KLineTime{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
