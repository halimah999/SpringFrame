package com.halimah.spring.springcore.intro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String args[]){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Employee emp = (Employee) ctx.getBean("emp");
        System.out.println(emp.getName());
        System.out.println(emp.getId());


    }
}
