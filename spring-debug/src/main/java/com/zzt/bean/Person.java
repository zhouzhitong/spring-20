package com.zzt.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 描述：<br>
 </>
 @author 周志通
 @version 1.0.0
 @date 2020/12/4 22:46 **/
@Component
//@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Person {

    private String name;
    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        setAge(age);
        setName(name);
    }

//    @Autowired
    public Person(Integer age, String name) {
        this(name, age);
    }

    public Person(Integer age) {
        this.age = age;
    }

    @PostConstruct
    public void init() {
        System.out.println("执行了 init()");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("执行了 destroy()");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
