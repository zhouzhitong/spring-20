package com.zzt.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 描述：<br>
 * </>
 *
 * @author 周志通
 * @version 1.0.0
 * @date 2020/12/2 22:34
 **/
public class CycleTest {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("/zzt/cycle.xml");


    }

}
