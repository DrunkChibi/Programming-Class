package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//Create a program that takes two numbers as inputs and prints out all of the prime numbers (in increasing value) between those two numbers(inclusive).
        //Prompt for two numbers using the following prompt twice:
    /*enter a number:

    Remember: A prime number is a [positive whole] number that is only divisible by it self and 1. Also 1 is not a prime number.

    Example Input		Example Output

    enter a number:
            1
    enter a number:
            7
            2
            3
            5
            7

    Example Input		Example Output

    enter a number:
            14
    enter a number:
            7
            7
            11
            13
            */

        Scanner console = new Scanner(System.in);
        System.out.println("Enter a number");
        String firstNumber = console.nextLine();
        System.out.println("Enter a number");
        String secNumber = console.nextLine();
        int firstNumberI = Integer.parseInt(firstNumber);
        int secNumberI = Integer.parseInt(secNumber);
        if (firstNumberI>secNumberI){
            int tempNumberI=firstNumberI;
            firstNumberI=secNumberI;
            secNumberI=tempNumberI;
        }

        for  (int i=firstNumberI; i<=secNumberI;i++ ){
            int num = 2;
            Boolean isPrime= true;
            while (num<i) {
                if (i % num == 0) {
                    isPrime = false;
                }
                num++;
            }
            if( isPrime && i!=0 && i!=1){
                System.out.println(i);
            }

        }



    }
}
