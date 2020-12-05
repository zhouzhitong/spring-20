package com.zzt.createBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 描述：<br>
 * </>
 *
 * @author 周志通
 * @version 1.0.0
 * @date 2020/12/4 23:12
 **/
public class TestDemo_CreateBean {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("/zzt/createBean.xml");


    }

}
