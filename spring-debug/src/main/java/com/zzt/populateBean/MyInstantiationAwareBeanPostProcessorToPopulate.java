package com.zzt.populateBean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

/**
 描述：<br>
 </>
 @author 周志通
 @version 1.0.0
 @date 2020/12/13 22:14 **/
public class MyInstantiationAwareBeanPostProcessorToPopulate implements InstantiationAwareBeanPostProcessor {

    /**
     @param bean     the bean instance created, with properties not having been set yet
     @param beanName the name of the bean
     @return 是否继续进行属性填充
     */
    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if (bean instanceof Address
                && beanName.equals("address")) {
            Address address = (Address) bean;
            address.setCity("上海");
            address.setProvince("宝山区");
            address.setTown("泉溪新村");
            return false; // 不再继续填充属性
        }
        if (bean instanceof Person) {
            Person person = (Person) bean;
            person.setName("root");
            return true;
        }
        return true;
    }
}
