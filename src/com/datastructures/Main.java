package com.datastructures;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {

    public static void main(String[] args) {

        Result result = JUnitCore.runClasses(TestHashSet.class);

        if(result.getFailures().size() > 0){
            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }
        }
        else{
            System.out.println("Test is passed");
        }
    }
}
