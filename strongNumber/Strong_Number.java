/// TASK: Write a program to check whether a number is a Strong number or not

package strongNumber;

import java.util.Scanner;  // importing Scanner class

// Creating class Strong_Number
public class Strong_Number {

    // factorial() to find out factorial of given argument integer
    static int factorial (int num) {
        if (num == 0)
            return 1;

        else if (num == 1 ) 
            return 1;
    
        else
            return factorial(num - 1) * num;
    }

    // checkStrongNumber() function to find out if the given number 
    // is a strong number and passes boolean value accordingly
    static boolean checkStrongNumber(int num1) {
        int copy = num1, digit, num2 = 0;      
        
        // loop to calculate the sum of the factorial of each digit of
        // given number with the help of factorial()
        while (copy != 0) {
            digit = copy % 10;
            num2 += factorial(digit);
            copy /= 10;
        }

        // returns the true or false value by comparing num1 (given number)
        // and num2 
        return (num1 == num2) ? true : false ;
    }

    // main function
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        // Reading the integer value from the user
        System.out.println("\nEnter a Valid integer: ");
        int number = scn.nextInt();
        scn.close();                    // closing the Scanner object

        // displaying if the given number is a strong number or 
        // not with checkStrongNumber() function
        if(checkStrongNumber(number)) {
            System.out.println(number + " is a strong number");
        }

        else {
            System.out.println(number + " is not a strong number");
        }
    }
}

//End Of Program
