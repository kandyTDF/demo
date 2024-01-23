package com.example.demo.service;

import com.example.demo.dto.DemoDTO;

public class TestService {

    public String testMethodV1() {

        return "Hello World";
    }

    public String testMethodV2(DemoDTO dto) {

        if(dto.getA().equals("abc") || dto.getB() == 1 || dto.getC() == Boolean.TRUE) {

            System.out.println("------------------------------");
        }

        System.out.println(dto.getA());
        System.out.println(dto.getB());
        System.out.println(dto.getC());

        return dto.getA();
    }
}
