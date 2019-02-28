package com.company;

/**
 * Created by zs1900 on 2/22/2019.
 */
public class Garfield {
    //Properties:
    String species;
    String name;

    //Constructor:
    public  Garfield (String name){
        species = "cat";
        this.name= name;

    }
    //Methods:
    public void MakeSound(){

        System.out.println("mmmm,  lasagna");
    }

    public void PrintName(){

        System.out.println("PrintName");
    }
    public void BeHappy(){
        System.out.println("*takes a nap*");

    }
    public void LayOnLap(){
        System.out.println("*cuddles on owner's lap*");
    }
    public void SeeLaser(){
        BeHappy();
    }
}
