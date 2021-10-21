/*-------------------------------------------------------------
// AUTHOR: Lokesh Budda Sankar Narayan
// FILENAME: Lab6
// SPECIFICATION: takes user input to do calcs and other tasks.
// FOR: CSE 110 Lab #6
//-----------------------------------------------------------*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab6 {

    public static void main(String[] args){
        //decimal formatting for Celsius
        DecimalFormat fmt = new DecimalFormat("0.00");
        //scanner object
        Scanner sc = new Scanner(System.in);
        Integer optNum = 0;
        do{
            //calling displayMenu()
            displayMenu();
            Integer choice;

            choice = sc.nextInt();
            sc.nextLine();

            optNum = choice;
            //switch statements
            switch (choice){
                //Case 1 - calls checkPrime() and displays if the number is prime or not
                case 1:
                    Integer numInput;
                    numInput = sc.nextInt();
                    if(checkPrime(numInput)){
                        System.out.println(numInput + " is prime\n\n");
                    }else
                        System.out.println(numInput + " is NOT a prime\n");
                    break;
                //Case 2 - calls tempConvert() to convert fahrenheit to Celsius then displays it
                case 2:
                    Double tempInput;
                    tempInput = sc.nextDouble();
                    System.out.println("Fahrenheit " + tempInput + " degree is equivalent to Celcis "
                                        + fmt.format(tempConvert(tempInput)) + " degree\n" );
                    break;
                //Case 3 - calls countE(); to count the number occurrences of the letter 'e'
                case 3:

                    String sentenceInput;

                    sentenceInput = sc.nextLine();
                    System.out.println("The sentence contains  " + countE(sentenceInput)+ " \'e\' and \'E\'\n");
                    break;
                default:
                    break;
            }
        }while(optNum != 4 || optNum > 4);
    }
    //Displays menu
    public static void displayMenu(){
        String s = "ASU CSE110 Lab #6 - Methods\n" +
                "\n" +
                "1) Check to see whether a number is prime or not\n" +
                "2) Convert temperature from Fahrenheit to Celsius\n" +
                "3) Count the number of character 'e' & 'E' in a string\n" +
                "4) Quit\n";
        System.out.println(s);
    }
    //checks to see if the input is prime or not
    public static boolean checkPrime(Integer num){
        for (int i = 2; i < num; i++)
            if (num % i == 0)
                return false;
        return true;
    }
    //Converts user input(Fahrenheit) to celsius
    public static Double tempConvert(Double farenTemp){
        return ((farenTemp-32)*5)/9;
    }

    //Counts the occurrences of the letter 'E' in the user input String.
    public static int countE(String line){
        Integer count = 0;
        for(int i = 0; i <line.length(); i++){
            if(line.charAt(i) == 'E' || line.charAt(i) == 'e') {
                count++;
            }
        }
        return count;
    }
}
