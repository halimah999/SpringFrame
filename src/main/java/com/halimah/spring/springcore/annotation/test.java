package com.halimah.spring.springcore.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main( String[] args )
    {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("annotationconfig.xml");
        Patient patient = (Patient) ctx.getBean("patient");
        System.out.println(patient);
        ctx.registerShutdownHook();

    }
}
