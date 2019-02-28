package com.company;

/**
 * Created by zs1900 on 2/21/2019.
 */
public class RussianBlue {
    //Properties:
    String species;
    String name;

    //Constructor:
    public RussianBlue(String name){
        species = "cat";
        this.name=name;
    }
    //Methods:
    public void Makesound(){
       System.out.print("Hisss");
    }

    public void PrintName(){
        System.out.print("PrintName");

    }
     public void BeHappy(){
        System.out.println("purrrr");

         SeeLaser();

    }
     public void SeeLaser() {

         System.out.println("cat pounces");}



}
