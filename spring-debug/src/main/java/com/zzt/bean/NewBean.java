package com.zzt.bean;

/**
 * 描述：<br>
 * </>
 *
 * @author 周志通
 * @version 1.0.0
 * @date 2020/12/2 9:00
 **/
public class NewBean {
    private String name;

    public NewBean(String name) {
        this.name = name;
    }

    public NewBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NewBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
