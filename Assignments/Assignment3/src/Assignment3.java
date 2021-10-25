//**************************************************************************
// FILE: Assignment3.java
// Name: Lokesh Budda Sankar Narayan
// Student ID: 1222415142
// Description: takes user input for 3 different cases and displays outputs
//              based on the options
// Course: ASU CSE110 Principles of Programming with Java
//***************************************************************************
import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String [] args){
        //Fields
        Integer optNumber;
        DecimalFormat fmt = new DecimalFormat("0.000");
        Scanner sc = new Scanner(System.in);
        /*
        Do while loop that keeps running as long as optNumber is not 4 or greater.
         */
        do{
            String s = "1) Convert kilometers into miles\n" +
                "2) Display a triangle shape\n" +
                "3) Predict bacteria's population\n" +
                "4) Quit\n\n";

        System.out.print(s);

//      System.out.println("pick out of the given options: ");
        optNumber = sc.nextInt();

        //Checks to see if option number is positive or if the optNumber is within parameters.
        while(optNumber <= 0 || optNumber > 4){
            System.out.println("Wrong choice! You can pick 1 to 4 only");
            System.out.println("please re-enter: ");
            optNumber = sc.nextInt();
            optNumber = optNumber;
        }

        /*
        Switch Statement - for each case of the menu
         */
        switch(optNumber) {
            /*
            Case 1 - takes user input to convert Kilometres to Miles.
             */
            case 1:
                    Integer km = 1, kmInput;
                    Double miles;
//                  System.out.println("Please enter a positive integer: ");
                    kmInput= sc.nextInt();
                    miles = km*0.6214;
                   //Checks to see if user input is positive.
                    while(kmInput <= 0){
                        System.out.println("Error, number must be positive");
                        kmInput = sc.nextInt();
                        kmInput = kmInput;
                    }

                    System.out.println("\nKilos\tMiles");

                    if(km>0){
                        //Prints the converted values.
                        for(int i = 1; i<=kmInput ; i++){
                            System.out.println( i + "\t" + fmt.format(miles*i));
                            km++;
                        }
                    }else
                        System.out.println("Invalid input.");
                System.out.println();
                break;
            /*
            Case 2 - takes in user input to determine the size of the triangle then prints it out.
             */
            case 2:
                Integer rows;
//              System.out.println("Please enter number of rows: ");
                rows = sc.nextInt();
                //Checks if 'rows' is positive.
                while(rows<=0) {
                    System.out.println("Error, number of rows must be positive\n");
//                  System.out.println("Please enter number of rows: ");
                    rows = sc.nextInt();
                }
                if(rows>0){
                    //Prints out the triangle
                    for(int i = 0; i<rows; i++){
                        for(int j = rows-i; j>1; j--){
                            System.out.print(" ");
                        }
                        for(int k = 0; k<=i*2; k++){
                            System.out.print("^");
                        }
                        System.out.println();
                    }
                }else
                    System.out.println("Invalid input");
                System.out.println();
                break;
            /*
            Case 3 - takes user input to simulate bacteria growth.
             */
            case 3:
                Integer popNum;
                Double percentInput;
                Integer numOfDays;

//              System.out.println("Enter the starting number of bacterias (2 or more):");
                popNum = sc.nextInt();
                // Checks if 'popNum' is at least 2.
                while(popNum <= 2){
                    System.out.println("Error, starting number must be at least 2\n");
//                    System.out.println("Please re-enter: ");
                    popNum = sc.nextInt();
                }

//              System.out.println("Enter the daily population increase rate as a percentage(e.g 3.5) : ");
                percentInput = sc.nextDouble();
                Double percent = percentInput/100;

                //Checks if 'percent' is positive
                while(percent <= 0) {
                    System.out.println("Error, increase rate must be positive\n");
//                  System.out.println("Please re-enter: ");
                    percentInput = sc.nextDouble();
                    percent = percentInput/100;
                }

//              System.out.println("Enter the number of days the bacterias will be left to multiply: ");
                numOfDays = sc.nextInt();
                Double population = popNum*percent;
                Integer day = 1;

                //Prints out the day and the population at the time.
                for(int i = 0; i <= numOfDays - 1 ; i++ ){
                    Double compoundPopNum = population + popNum;
                    System.out.print("Population after day "+ day + ": " + (int)Math.floor(compoundPopNum) + "\n");
                    Integer num = (int) Math.floor(compoundPopNum);
                    popNum = num;
                    population = popNum*percent;
                    day++;
                }
                System.out.println();
                break;
        }
           }while(optNumber != 4 || optNumber > 4);
    }

}