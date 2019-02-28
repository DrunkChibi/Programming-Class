package com.company;

/**
 * Created by zs1900 on 2/5/2019.
 */
public class Animal {
    String species;
    String name;
    String color;
     int age;


    //constructor(s)
    public Animal(String Species,String Name, String Color ){
        species=Species;
        name=Name;
        color=Color;
        age=0;
    }
    public void makeSound(){
        System.out.print("Grrrrr");
    }

    public void SetAge(int newAge) {
        System.out.print("26");
    }

    public void PrintDescription() {
        System.out.print("name +\" is a \"+year+\" year old, \"+color+\" \"+species");
    }


}
