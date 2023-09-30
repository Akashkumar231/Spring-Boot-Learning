package com.akash.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        String message = " Practising fast bowling for 15 minutes :-) ";
        return message;
    }
}
