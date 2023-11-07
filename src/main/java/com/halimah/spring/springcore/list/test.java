package com.halimah.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String args[]){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("listconfig.xml");
        Hospital hospital = (Hospital)ctx.getBean("hospital");
        System.out.println(hospital.getName());
        System.out.println(hospital.getDepartments());


    }
}
