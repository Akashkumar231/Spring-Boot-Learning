package com.akash.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component

public class BaseBallCoach implements Coach {

    BaseBallCoach(){

        System.out.println("In constructor   " + this.getClass().getSimpleName());

    }
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practise";
    }
}
