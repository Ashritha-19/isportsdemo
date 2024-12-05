package com.neoteric.isports.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.time.Duration;
import java.time.Instant;

public class TimeExecution {

    private static final Logger logger = LogManager.getLogger(TimeExecution.class);

    public static void calculateExecutionTime(String methodName, Runnable methodToRun){

        Instant startTime = Instant.now();

        methodToRun.run();

        Instant endTime = Instant.now();

        Duration duration = Duration.between(startTime,endTime);

        long timeInMilliSeconds = duration.toMillis();

    logger.info("Time Execution for a method"+ methodName + ": " + timeInMilliSeconds + " ms");

    }
}
