/*-------------------------------------------------------------
// Author: Lokesh Budda Sankar Narayan
// ASU ID: 1222415142
// For: CSE 110 Lab #2
// Description:
//-----------------------------------------------------------*/


import java.util.Scanner;
import java.util.Locale;

public class Lab2 {
    public static void main(String[] args){
        //declare & initialize variables of different types
        String firstName = "";
        String lastName = "";
        String fullName = "";
        Integer nameLength = 0;

        Scanner scan = new Scanner(System.in);

        //System.out.println("Please enter first name: ");
        firstName = scan.nextLine();

        //System.out.println("Please enter last name: ");
        lastName = scan.nextLine();


        fullName = firstName +" "+ lastName;
        fullName = fullName.toUpperCase();

        nameLength = fullName.length();

        String subStr = fullName.substring(5,9);
        char charAtIndex2 = fullName.charAt(2);

        System.out.println("Full name (in capitals): "+ fullName);
        System.out.println("Length of full name: " + nameLength);
        System.out.println("Sub string between index 5 and 9 is: "+ subStr);
        System.out.println("Character at index 2 is: " + charAtIndex2);

        String title1 = new String("java");
        String title2 = new String("java");
        String title3 = new String("Java");



        // Compare the two strings and print which one of the two ways works. Follow code below:
        if (title1 == title2){
            System.out.println("String comparison using \"==\" sign works");
        } else{
            System.out.println("String comparison using \"==\" sign does NOT work");
        }
        if (title1.equals(title2)){
            System.out.println("String comparison using \"equals\" method works");
        } else{
            System.out.println("String comparison using \"equals\" method does NOT work");
        }
        if (title1.equalsIgnoreCase(title3)){
            System.out.println( "String comparison using \"equalsIgnoreCase\" method works");
        } else{
            System.out.println("String comparison using \"equalsIgnoreCase\" method does NOT work");
        }
    }
}
