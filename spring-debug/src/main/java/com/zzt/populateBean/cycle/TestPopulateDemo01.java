package com.zzt.populateBean.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 描述：<br>
 </>
 @author 周志通
 @version 1.0.0
 @date 2020/12/15 20:53 **/
public class TestPopulateDemo01 {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("/zzt/populateCycleBean.xml");
        A a = ac.getBean("a", A.class);
        B b = ac.getBean("b", B.class);
        System.out.println(a);
        System.out.println(b);

    }


}
