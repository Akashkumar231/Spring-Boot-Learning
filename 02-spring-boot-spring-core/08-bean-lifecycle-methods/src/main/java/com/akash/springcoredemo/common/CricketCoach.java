package com.akash.springcoredemo.common;



import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{


    CricketCoach(){

        System.out.println("In constructor   " + this.getClass().getSimpleName());


    }

    // define our init method
    @PostConstruct
    public void initMethod(){

        System.out.println("In intiMethod(): " + getClass().getSimpleName());

    }


    // define our destroy method

    @PreDestroy
    public void destroyMethod(){

        System.out.println("In destroyMethod(): " + getClass().getSimpleName());

    }

    @Override
    public String getDailyWorkout() {

        return " It's an Order for :( , Practising fast bowling for 15 minutes :-) ";

    }
}
