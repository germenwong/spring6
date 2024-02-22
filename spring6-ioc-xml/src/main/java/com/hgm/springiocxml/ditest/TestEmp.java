package com.hgm.springiocxml.ditest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di-array.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.work();
    }
}
