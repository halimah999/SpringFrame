package com.halimah.spring.springcore.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean , DisposableBean {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("inside setter method");
        this.id = id;
    }



    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("inside afterPropertiesSet method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("inside destroy method");
    }
    @Override
    public String toString() {
        return "patient{" +
                "id=" + id +
                '}';
    }
}
