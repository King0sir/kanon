package org.kin.enums;

/**
 * Created by kinakihiro on 2017/4/8.
 */
public enum FuQuanType {
    No("bfq","不复权"),
    Before("qfq","前复权");

    private String code;

    private String name;

    FuQuanType(String code, String name) {
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

    public static FuQuanType getFuQuanType(String code){
        for(FuQuanType type : values()){
            if(type.getCode().equals(code)){
                return type;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "FuQuanType{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
