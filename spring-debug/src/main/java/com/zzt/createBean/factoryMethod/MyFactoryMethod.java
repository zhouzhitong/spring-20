package com.zzt.createBean.factoryMethod;

import com.zzt.bean.NewBean;

/**
 * 描述：<br>
 * </>
 *
 * @author 周志通
 * @version 1.0.0
 * @date 2020/12/2 9:20
 **/
public class MyFactoryMethod {

    public NewBean createNewBean() {
        return new NewBean("通过 factoryMethod 创建的 Bean 对象!!!");
    }

}
