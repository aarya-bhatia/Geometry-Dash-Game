package com.aarya.util;

public class Time {

    public static double startTime = System.nanoTime();

    public static double getTime() {
        return (System.nanoTime() - startTime) * 1E-9;
    }
}
