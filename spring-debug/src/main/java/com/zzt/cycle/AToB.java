package com.zzt.cycle;

/**
 * 描述：<br>
 * </>
 *
 * @author 周志通
 * @version 1.0.0
 * @date 2020/12/2 22:29
 **/
public class AToB {

    private BToA b;

    public AToB() {
    }

    public AToB(BToA b) {
        this.b = b;
    }

    public BToA getB() {
        return b;
    }

    public void setB(BToA b) {
        this.b = b;
    }
}
