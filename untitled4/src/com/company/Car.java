package com.company;

/**
 * Created by zs1900 on 2/4/2019.
 */
public class Car {
    //properties
    String make;
    String model;
    double milesTraveled;
    double tanksize;
    double galloneOfGasllon;
    double mpg;

    //constructor(s)
    public Car () {
        make = "ford";
        model = "escape";
        milesTraveled = 0;
        tanksize = 13;
        galloneOfGasllon = tanksize;
        mpg = 24;
    }