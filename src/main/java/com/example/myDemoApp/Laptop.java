package com.example.myDemoApp;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public void compile(){
        System.out.println("Laptop is compiled");
    }

}
