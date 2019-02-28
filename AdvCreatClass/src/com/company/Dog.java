package com.company;

/**
 * Created by zs1900 on 2/14/2019.
 */
public  class Dog {
    //Properties
    String species;
    String name;
    boolean dockedTail;

    //Constructor:
    public  Dog(String Species, String Name, boolean DockedTail) {


    species=Species;
     name=Name;
     dockedTail=DockedTail;
}
    //Methods:
    public static void makeSound(){ System.out.println("Woof");}

     public static void Printname(){System.out.println("Printname");}

     public static void PLayFetch(){System.out.println("*chases ball 5 times then quits*");}

     public  boolean getDockedTail(){
       return dockedTail;

     }




}
