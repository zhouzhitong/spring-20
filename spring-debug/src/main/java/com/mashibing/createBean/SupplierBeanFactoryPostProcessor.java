package com.mashibing.createBean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class SupplierBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition user = beanFactory.getBeanDefinition("newBeanBySupplier");
        GenericBeanDefinition genericBeanDefinition = (GenericBeanDefinition) user;
        genericBeanDefinition.setInstanceSupplier(CreateSupplier::createNewBean);
        genericBeanDefinition.setBeanClass(NewBean.class);
    }
}
