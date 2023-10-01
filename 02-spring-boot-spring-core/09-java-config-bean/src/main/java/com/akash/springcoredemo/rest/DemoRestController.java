package com.akash.springcoredemo.rest;

import com.akash.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    // define a private field for the dependency
    private final Coach myCoach1;


    @Autowired
      DemoRestController(@Qualifier("bean") Coach theCoach1 ){

        System.out.println("In constructor    " + this.getClass().getSimpleName());

        this.myCoach1=theCoach1;



    }



    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){

        return myCoach1.getDailyWorkout();

    }




}
