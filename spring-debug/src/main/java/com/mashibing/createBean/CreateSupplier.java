package com.mashibing.createBean;


/**
 * 描述：<br>
 * </>
 *
 * @author 周志通
 * @version 1.0.0
 * @date 2020/12/2 9:06
 **/
public class CreateSupplier {

    public static NewBean createNewBean() {
        System.out.println("---------" + CreateSupplier.class + "--------");
        return new NewBean("通过 supplier 创建得到的对象！！！");
    }

}
