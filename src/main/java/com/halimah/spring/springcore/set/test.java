package com.halimah.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String args[]){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("setconfig.xml");
        CarDealer carDealer = (CarDealer)ctx.getBean("dealer");
        System.out.println(carDealer.getName());
        System.out.println(carDealer.getModels());


    }
}
