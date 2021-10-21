/*-------------------------------------------------------------
// Author: Lokesh Budda Sankar Narayan
// ASU ID: 1222415142
// For: CSE 110 Lab #3
// Description: Input output program. Take input values and runs
// it through an equation to display a result.
//-----------------------------------------------------------*/

import java.util.Scanner;

import java.text.DecimalFormat;

public class Lab3 {
    //Main class
    public static void main(String[] args){
        //fields
        final Double PI = 3.1415926;
        Double x, y, z;
        Double A;

        //Scanner class
        Scanner scan = new Scanner(System.in);

        //User input - Commented out for gradescope.
//        System.out.println("enter x value");
        x = scan.nextDouble();
//        //user input
//        System.out.println("enter y value");
        y = scan.nextDouble();
//        //User input
//        System.out.println("enter z value");
        z = scan.nextDouble();

        //Decimal formatting - limiting to 3 decimal points
        DecimalFormat fmt = new DecimalFormat("0.000");

        /*
           The Equation
         */
        //The Numerator
        Double numerator  = Math.sqrt((Math.pow(3*Math.pow(x,2)+2*y,2))-(4*z));

        //The Denominator
        Double denominator = (PI*(Math.pow(z,2)))-(2*x);

        //Displaying result
        A  = numerator/denominator;
        System.out.println("A value is: " + fmt.format(A));

        //Closing scanner object
        scan.close();
    }

}
