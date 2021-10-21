/*-------------------------------------------------------------
// Author: Lokesh Budda Sankar Narayan
// ASU ID: 1222415142
// For: CSE 110 Lab #4
// Description: usefulness of the switch statement.
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab4 {
    //Main class
    public static void main(String[] args){
        //Fields
        Integer userInput;
        String day;

        //Scanner object.
        Scanner sc = new Scanner(System.in);
        //Removed for gradescope.
//        System.out.println("Enter an integer between 1 to 7:");
        userInput = sc.nextInt();

        //if else if statement to assign number with the day
        if(userInput == 1){
            System.out.println("Monday");
        }else if(userInput == 2){
            System.out.println("Tuesday");
        }else if(userInput == 3){
            System.out.println("Wednesday");
        }else if(userInput == 4){
            System.out.println("Thursday");
        }else if(userInput == 5){
            System.out.println("Friday");
        }else if(userInput == 6){
            System.out.println("Saturday");
        }else if(userInput == 7){
            System.out.println("Sunday");
        }

        //Switch statement to assign the number with the day.
        switch (userInput){
            case 1 : day = "Monday - by switch";
                break;
            case 2 : day = "Tuesday - by switch";
                break;
            case 3 : day = "Wednesday - by switch";
                break;
            case 4 : day = "Thursday - by switch";
                break;
            case 5 : day = "Friday - by switch";
                break;
            case 6 : day = "Saturday - by switch";
                break;
            case 7 : day = "Sunday - by switch";
                break;
            default: day = "Invalid input, input must be between 1 to 7";
                break;
        }
        //Displays result
        System.out.println(day);




    }
}
