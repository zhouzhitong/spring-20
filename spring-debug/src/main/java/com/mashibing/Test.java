package com.mashibing;

import com.mashibing.createBean.MyFactoryBean;
import com.mashibing.createBean.NewBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
//        MyClassPathXmlApplicationContext ac = new MyClassPathXmlApplicationContext("factoryBean.xml");
//        MyFactoryBean bean1 = (MyFactoryBean) ac.getBean( "&myFactoryBean");
//        System.out.println(bean1);
//        User bean = (User) ac.getBean("myFactoryBean");
//        System.out.println(bean.getUsername());
//        User bean2 = (User) ac.getBean("myFactoryBean");
//        System.out.println(bean2.getUsername());

//        MyClassPathXmlApplicationContext ac = new MyClassPathXmlApplicationContext("applicationContext.xml");
//        System.out.println(ac.getBean(MyPropertySource.class).getName());
//        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-${username}.xml");
//        Person bean = ac.getBean(Person.class);
//        System.out.println(bean);
//        A bean1 = ac.getBean(A.class);
//        System.out.println(bean1);
//        ac.close();
//        User user = (User) ac.getBean("msb");
//        System.out.println(user.getUsername());

//        MyClassPathXmlApplicationContext ac = new MyClassPathXmlApplicationContext("selfEditor.xml");
//        Customer bean = ac.getBean(Customer.class);
//        System.out.println(bean);
//        ConversionService bean = ac.getBean(ConversionService.class);
//        Student convert = bean.convert("1_zhangsan", Student.class);
//        System.out.println(convert);

//        MyClassPathXmlApplicationContext ac = new MyClassPathXmlApplicationContext("factoryMethod.xml");

//        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("test.xml");
//        Person person = ac.getBean("person", Person.class);
//        ac.close();
//        Person person2 = ac.getBean("person", Person.class);

        ApplicationContext ac = new ClassPathXmlApplicationContext("createBean.xml");
        NewBean myFactoryBeanNewBean = ac.getBean("myFactoryBean", NewBean.class);
        System.out.println(myFactoryBeanNewBean);
        MyFactoryBean myFactoryBean = ac.getBean("&myFactoryBean", MyFactoryBean.class);
        System.out.println(myFactoryBean);
        NewBean newBeanBySupplier = ac.getBean("newBeanBySupplier", NewBean.class);
        System.out.println(newBeanBySupplier);
        NewBean newBean = ac.getBean("newBean", NewBean.class);
        System.out.println(newBean);

    }
}
