package com.akash.springcoredemo.common;


import org.springframework.stereotype.Component;

@Component

public class CricketCoach implements Coach{


    CricketCoach(){

        System.out.println("In constructor   " + this.getClass().getSimpleName());


    }

    @Override
    public String getDailyWorkout() {

        return " It's an Order for :( , Practising fast bowling for 15 minutes :-) ";

    }
}
