//TASK: Write a program to check leap year 

package leapYearCheck;

import java.util.Scanner;       // importing Scanner class

// creating the LeapYearChecker class 
public class LeapYearChecker {
    
    // checkLeap() to check if the given year is a leap year or not
    // with the help of if-else
    static boolean checkLeap(int year) {
        if (year%4 == 0) {
            if (year % 100 == 0) {            
                if (year % 400 == 0) 
                    return true;
                else 
                    return false;
            }
            else 
                return true;
        }
        return false;
    }

    // main function
    public static void main(String[] args) {
        // Instantiating Scanner object for reading user input
        Scanner scn = new Scanner(System.in);

        // Reading User inpur for the value of year
        System.out.println("Enter a valid year: ");
        int year = scn.nextInt();
        scn.close();                        // closing the Scanner object

        // checking if the given year is leap or not with the help of
        // checkLeap() and printing the respective result with the 
        // if-else statements
        if (checkLeap(year)) {
            System.out.println(year + " is a leap year");
        }

        else {
            System.out.println(year + " is not a leap year");
        }
    }
}

// End Of Program