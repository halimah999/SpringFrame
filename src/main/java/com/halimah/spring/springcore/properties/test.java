package com.halimah.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String args[]){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("propconfig.xml");
        CountriesAndLanguages countriesAndLanguages = (CountriesAndLanguages)ctx.getBean("countries");
        System.out.println(countriesAndLanguages);



    }
}
