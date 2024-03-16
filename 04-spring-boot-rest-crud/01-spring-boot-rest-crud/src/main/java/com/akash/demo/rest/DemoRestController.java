package com.akash.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
@RequestMapping("/test")
public class DemoRestController {

   // add code for the "/hello" endpoint

    @GetMapping("/hello")
    public String sayHello(){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a + b;
        return sum + "Hello World";

    }


}
