package com.zzt.populateBean.cycle;

/**
 描述：<br>
 </>
 @author 周志通
 @version 1.0.0
 @date 2020/12/15 20:53 **/
public class B {

    private A a;

    public B() {
    }

    public B(A a) {
        this.a = a;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }
}
