package com.jing.pattern;

/**
 * Created by jingdongqi on 10/22/15.
 */

public class Weather {
    private String desc;

    public Weather(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "desc='" + desc + '\'' +
                '}';
    }
}
