package com.example.demo.controller;

import com.example.demo.dto.DemoDTO;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("v1")
    String testMethodV1() {

        return testService.testMethodV1();
    }

    @PostMapping("v2")
    String testMethodV2(@RequestBody DemoDTO dto) {

        return testService.testMethodV2(dto);
    }
}
