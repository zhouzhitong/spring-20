package com.zzt.createBean.supplier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 描述：<br>
 * </>
 *
 * @author 周志通
 * @version 1.0.0
 * @date 2020/12/4 22:44
 **/
public class TestDemo_Supplier {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("/zzt/supplier.xml");
        User bean = ac.getBean(User.class);
        System.out.println(bean);
    }
}
