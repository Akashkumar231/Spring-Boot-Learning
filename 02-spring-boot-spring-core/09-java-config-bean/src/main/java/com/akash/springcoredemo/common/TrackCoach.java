package com.akash.springcoredemo.common;

import com.akash.springcoredemo.common.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class TrackCoach implements Coach {

    TrackCoach(){

        System.out.println("In constructor   " + this.getClass().getSimpleName());


    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k ";
    }
}
