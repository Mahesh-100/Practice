package com.java8;

import java.time.Duration;
import java.time.Instant;

import static java.time.Instant.now;

public class InstantAndDuration {
    public static void main(String[] args) throws InterruptedException {

        Instant start = now();
        System.out.println(start);

        Thread.sleep(1000);

        Instant end = now();
        System.out.println(end);

        Duration elapsed = Duration.between(start, end);
        System.out.println("Elapsed: "+ elapsed +" milliseconds");
    }
}
