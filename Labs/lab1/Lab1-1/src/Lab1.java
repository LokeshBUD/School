/*-------------------------------------------------------------
// Author: Lokesh Budda Sankar Narayan
// ASU ID: 1222415142
// For: CSE 110 Lab #1
// Description: basic scanner usage. input output program.
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args){
            //write code here
            //declare variables
            Integer test1,test2,test3;
            final Integer NUM_TESTS = 3;
            Double average;

            //create a Scanner object
            Scanner in = new Scanner(System.in);

            //get user input - user prompt
            System.out.print("Enter the score on the first test: \n");
            test1 = in.nextInt();

            System.out.print("Enter the score on the second test: \n");
            test2 = in.nextInt();

            System.out.print("Enter the score on the third test: \n");
            test3 = in.nextInt();

            average = (test1 + test2 + test3) / (double)NUM_TESTS;

            System.out.println("Your test average is: " + average);
        }

}

