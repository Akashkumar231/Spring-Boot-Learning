package com.akash.springcoredemo.common;

import com.akash.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    // define a private field for the dependency
    private final Coach myCoach;

    @Autowired
      DemoRestController(@Qualifier("cricketCoach") Coach theCoach){

        System.out.println("In constructor    " + this.getClass().getSimpleName());

        this.myCoach=theCoach;

    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){

        return myCoach.getDailyWorkout();

    }



}
