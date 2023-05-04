package com.atguigu.spring6.pojo;

public class Person {
    private Axe axe;

    public Person() {
    }

    public void setAxe(Axe axe) {
        this.axe = axe;
    }
    public void useAxe(){
        System.out.println("砍柴");
        System.out.println(axe.chop());
    }
}
