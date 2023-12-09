package com.halimah.spring.springcore.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main( String[] args )
    {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("interfacesconfig.xml");
        Patient patient = (Patient) ctx.getBean("patient");
        System.out.println(patient);
        ctx.registerShutdownHook();

    }
}
