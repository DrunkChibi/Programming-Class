package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
Given a time in 12 hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

You program should ask for the time using the following prompts:
Enter hour for 12 hr time format:
Enter min for 12 hr time format:
Enter sec for 12 hr time format:
Enter AM/PM:

your program should convert and print the given time in 24-hour format.


Example input		Example output

					Enter hour for 12 hr time format:
07
					Enter min for 12 hr time format:
05
					Enter sec for 12 hr time format:
45
					Enter AM/PM:
PM
					19:05:45

Example input		Example output

					Enter hour for 12 hr time format:
12
					Enter min for 12 hr time format:
08
					Enter sec for 12 hr time format:
59
					Enter AM/PM:
AM
					00:08:59
*/

	// Convert 12 Hours in to Military

        // Convert 12 mins in to Military.

          // Convert 12 sec in to Military.

        //  Print out AM or PM

          // Get user input from user

        //  Print out right input from user to screen.

        Scanner console = new Scanner(System.in);
        int minuteTime=0;
        System.out.println("Enter minutes");
        try{
            minuteTime=Integer.parseInt(console.nextLine());
        }
        catch (NumberFormatException ex){
            System.out.println("Invalid minutes");
            return;
        }
        if(minuteTime > 59){
            System.out.println("Invalid minute");
            return;
        }
        int secondsTime=0;
        System.out.println("Enter seconds");
        try{
            secondsTime=Integer.parseInt(console.nextLine());
        }
        catch (NumberFormatException ex){
            System.out.println("Invalid seconds");
            return;
        }
        if (secondsTime>59){
            System.out.println("Invalid seconds");
            return;
        }
        System.out.println("Enter am or pm");
        String m = "";
        try {
            m = console.nextLine(); // don't need conversion part only enter string
        }
        catch(NumberFormatException ex)
        {
            System.out.println("invalid time");
            return;
        }
        if(m.equals("AM") || m.equals("Am") ||m.equals("am"))
        {
            if(hourTime == 12)
            {hourTime = 0;} // if time equals 12am will reset back to zero
        }
        else if(m.equals("PM") || m.equals("Pm") || m.equals("pm"))
        {
            if (hourTime!=12){
                hourTime=hourTime+12;
            }
        }
        else
        {
            System.out.println("Invalid time");
            return;
        }
        System.out.println(hourTime + ":" + minuteTime + ":" + secondsTime + ":" + m);
    }
}
