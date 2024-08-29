package maxOfTwo;
// Task : Create a program to find maximum between two inputs

import java.util.Scanner;

public class Lab1 {


    public static void main(String[] args) {
        //creating a Scanner object to take inputs 
        Scanner inp = new Scanner(System.in);


        // Taking inputs from the console
        System.out.println("Compare two numbers and find the maximum:");
        System.out.println("Enter no. 1: ");
        int a = inp.nextInt();


        System.out.println("Enter no. 2: ");
        int b = inp.nextInt();

        // closing Scanner object input stream
        inp.close();

        // comparing the taken values with ternary operator
        int max = (a<b) ? b : a;


        // displaying the maximum of the taken values
        System.out.println("Maximum of given numbers is : " + max);
    }
    
}

// End of Program
