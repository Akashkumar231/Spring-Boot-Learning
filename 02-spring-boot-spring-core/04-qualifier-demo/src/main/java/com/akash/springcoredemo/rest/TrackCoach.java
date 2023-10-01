package com.akash.springcoredemo.rest;

import com.akash.springcoredemo.common.Coach;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k ";
    }
}
