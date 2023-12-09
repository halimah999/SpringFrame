package com.halimah.spring.springcore.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("inside setter method");
        this.id = id;
    }
    @PostConstruct
    public void hi(){
        System.out.println("inside Hi method");
    }
    @PreDestroy
    public void bye(){
        System.out.println("inside Bye method");
    }

    @Override
    public String toString() {
        return "patient{" +
                "id=" + id +
                '}';
    }
}
