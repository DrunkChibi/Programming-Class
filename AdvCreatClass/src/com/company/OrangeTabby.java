package com.company;

/**
 * Created by zs1900 on 2/19/2019.
 */
public class OrangeTabby {

    //Properties:
    String species;
    String name;

    //Constructor:
    public  OrangeTabby( String name) {
        species= "cat";
       this.name = name;


    }

    //Methods:
    public void MakeSound() {
        System.out.println("meow");
    }

    public void PrintName() {
        System.out.println("PrintName");
    }

    public void Behappy() {
        System.out.println("takes a nap");


    }

    public void LayonLap() {

        System.out.print("cuddles on owner's lap");
    }

    public void SeeLaser(){
        System.out.print("cat pounces");
    }
}
