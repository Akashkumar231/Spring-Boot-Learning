package com.akash.springcoredemo.rest;

import com.akash.springcoredemo.common.Coach;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practise your backhand volley";
    }
}
