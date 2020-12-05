package com.mashibing.createBean;

import org.springframework.beans.factory.FactoryBean;

/**
 * 描述：<br>
 * </>
 *
 * @author 周志通
 * @version 1.0.0
 * @date 2020/12/2 9:01
 **/
public class MyFactoryBean implements FactoryBean<NewBean> {
    @Override
    public NewBean getObject() throws Exception {
        return new NewBean("通过 new 创建的对象");
    }

    @Override
    public Class<?> getObjectType() {
        return NewBean.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
