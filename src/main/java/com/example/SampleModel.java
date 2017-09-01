package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SampleModel {
    private static final Logger logger = LoggerFactory.getLogger(SampleModel.class);
    
    public void test(boolean isSuccess) {
        logger.debug("test");

        if (isSuccess) {
            if (isSuccess) {
                if (isSuccess) {
                    if (isSuccess) {
                        System.out.println("This is sample class to check sonar violations");
                    }
                }
            }
        }
    }

}

public void test1(boolean isSuccess) {
        logger.debug("test");

        if (isSuccess) {
            if (isSuccess) {
                if (isSuccess) {
                    if (isSuccess) {
                        System.out.println("This is sample class to check sonar violations");
                    }
                }
            }
        }
    }

}
