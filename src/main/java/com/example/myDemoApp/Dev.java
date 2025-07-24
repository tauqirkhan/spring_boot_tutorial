package com.example.myDemoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev extends Laptop{

//    field injection
    @Autowired
    @Qualifier("laptop")
    private Computer comp;

    //Constructor Injection
//    private Laptop laptop;

//     Setter Injection
//    @Autowired
//    public void setLaptop(Laptop lap){
//        this.laptop =  lap;
//    }

    public void build(){
        System.out.println("This is demo project");
        comp.compile();
    }
}
