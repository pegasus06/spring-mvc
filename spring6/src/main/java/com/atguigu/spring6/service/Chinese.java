package com.atguigu.spring6.service;

import org.springframework.beans.factory.BeanNameAware;

public class Chinese implements BeanNameAware {
    private String beanName;
    @Override
    public void setBeanName(String name) {
        this.beanName=name;
    }
    public void info(){
        System.out.println("chinnese实现类"+",部署该bean时指定的id为:"+beanName);
    }
}
