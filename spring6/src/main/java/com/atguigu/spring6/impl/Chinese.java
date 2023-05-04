package com.atguigu.spring6.impl;

import com.atguigu.spring6.pojo.Axe;
import com.atguigu.spring6.pojo.inteface.Person;
import org.springframework.beans.factory.DisposableBean;

public class Chinese implements Person, DisposableBean {
    private Axe axe;
    public Chinese(){
        System.out.println("spring实例化主调bean:Chinese实例");
    }
    public void setAxe(Axe axe){
        System.out.println("spring执行依赖关系注入");
        this.axe=axe;
    }
    @Override
    public void useAxe() {
        System.out.println(axe.chop());
    }
    public void close(){
        System.out.println("正在执行销毁之前的方法close");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("正在执行销毁之前的方法destory");
    }
}
