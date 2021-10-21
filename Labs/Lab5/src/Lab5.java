/*-------------------------------------------------------------
// AUTHOR: Lokesh Budda Sankar Narayan
// FILENAME: Lab5.java
// SPECIFICATION: asks for user input, then uses that input to do
                some basic math using loops.
// FOR: CSE 110 Lab #5
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args){
        //Fields
        Integer categoryNum, m,i=1, sum = 0, opt1 = 0, opt2, opt3;

        //Displays menu
        String s = "1) Calculate the sum of integers 1 to m\n" +
                "2) Calculate the factorial of a given number\n" +
                "3) Find the first digit of a given number\n" +
                "4) Quit\n";

        System.out.println(s);

        //Asks for user input for the menu number
        Scanner sc = new Scanner(System.in);
//        System.out.println("Please choose from above menu: ");
        categoryNum = sc.nextInt();

        /*
        While loop that keeps the program going until the user chooses 4
         */
        while(categoryNum != 4){
           //Switch statement for each category
            switch (categoryNum){
               case 1:
//                   System.out.println("Enter the number:");
                   opt1 = sc.nextInt();
                   //At the end of each iteration sum will have the value of sum till ith integer
                   while(i <= opt1){
                       sum += i;
                       i++;
                   }
                   System.out.println("The sum of 1 to " + opt1 + " is " + sum + "\n");
                break;
               case 2:
//                   System.out.println("Enter the number:");
                   opt2 = sc.nextInt();
                   Integer n = opt2, fact =1;
                   //Computes the factorial of a given integer
                   for (i = 1; i <= n; i++){
                       fact = fact*i;
                   }
                   System.out.println("The factorial of "+ opt2 + " is "+ fact + "\n");
                break;
               case 3:
//                   System.out.println("Enter the number:");
                   opt3 = sc.nextInt();
                   Integer rem = 0;
                   /*
                   at every iteration rem will have the 1st digit from left for an integer
                   num will have 1 digit less than its previous iteration
                    */
                   while(opt3 != 0)
                   {
                       rem = opt3%10;
                       opt3 = opt3/10;
                   }
                   System.out.println("The leftmost digit is "+ rem + "\n");
                break;
               default: System.out.println("invalid input");
           }

           //prints out the menu from the top
           System.out.println(s);

//           System.out.println("Please choose from above menu: ");
           Integer choice = sc.nextInt();
           //keeps the loop going until option 4 is chosen.
           categoryNum = choice;


       }


    }
}
