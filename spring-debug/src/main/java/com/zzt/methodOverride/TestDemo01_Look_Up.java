package com.zzt.methodOverride;

import com.zzt.methodOverride.lookup.Apple;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 描述：<br>
 * </>
 *
 * @author 周志通
 * @version 1.0.0
 * @date 2020/12/4 23:17
 **/
public class TestDemo01_Look_Up {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("/zzt/methodOverride.xml");
        Apple apple = (Apple) ac.getBean("apple");
        apple = (Apple) ac.getBean("apple");
        Apple apple2 = (Apple) ac.getBean("apple2");
        apple2 = (Apple) ac.getBean("apple2");

    }

}
