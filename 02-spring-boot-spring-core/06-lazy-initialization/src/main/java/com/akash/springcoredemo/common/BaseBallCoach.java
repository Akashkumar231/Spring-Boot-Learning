package com.akash.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BaseBallCoach implements Coach {

    BaseBallCoach(){

        System.out.println("In constructor   " + this.getClass().getSimpleName());

    }
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practise";
    }
}
