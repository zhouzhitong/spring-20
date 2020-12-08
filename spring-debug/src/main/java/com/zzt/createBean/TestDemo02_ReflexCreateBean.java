package com.zzt.createBean;

import com.zzt.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 描述：<br>
 * </>
 *
 * @author 周志通
 * @version 1.0.0
 * @date 2020/12/5 23:32
 **/
public class TestDemo02_ReflexCreateBean {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("/zzt/reflexCreateBean.xml");
        Person person;
        person = (Person) ac.getBean("person");
        person = (Person) ac.getBean("person");
        /*person = (Person) ac.getBean("person2");
        person = (Person) ac.getBean("person2");
        person = (Person) ac.getBean("person3");
        person = (Person) ac.getBean("person3");*/


    }
}
