//**************************************************************************
// FILE: Assignment4.java
// Name: Lokesh Budda Sankar Narayan
// Student ID: 1222415142
// Description: Program that uses poco class and user inputs to display
//              certain string and do calculations.
// Course: ASU CSE110 Principles of Programming with Java
//***************************************************************************

import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args){
        //Fields
        Integer itemID;
        String size,color, choice;
        Double price;
        //Scanner object
        Scanner sc = new Scanner(System.in);

        //Decimal format for displaying.
        DecimalFormat fmt = new DecimalFormat("0.00%");
        DecimalFormat fmt2 = new DecimalFormat("0.00");

        //Displays the menu
        System.out.print("\nWelcome to Target Clothing Dept\n"+ "==============================\n");
        System.out.println(displayMenu());

        //Takes user input
        itemID = sc.nextInt();
        sc.nextLine();
        size = sc.nextLine();
        color = sc.nextLine();
        price = sc.nextDouble();
        sc.nextLine();

        //Clothes object created
        Clothes c = new Clothes(itemID, size, color, price);

        //sets each field to its corresponding parameter
        c.setItemID(itemID);
        c.setSize(size);
        c.setColors(color);
        c.setPrice(price);

        /*
            Do-While loop - takes user input to change the clothes object.
                          - Runs as long as user input doesn't equal "q" or "Q"
         */
        do{

            choice = sc.next().toUpperCase();
            sc.nextLine();

            /*
                Switch statement - Changed parts of the clothes object as the user inputs are requested.
             */
            switch(choice){
                case "S" :
                    String changeSize;
                    changeSize = sc.nextLine();
                    c.changeSize(changeSize);
                    System.out.println("The size has been changed from "+ size + " to "+ c.getSize());
                    break;
                case "C":
                    String changeColor;
                    changeColor = sc.nextLine();
                    c.changeColor(changeColor);
                    System.out.println("The color has been changed from " + color + " to " + c.getColors());
                    break;
                case "I":
                    Double iPrice;
                    iPrice = sc.nextDouble();
                     c.raisePrice(iPrice);
                    System.out.println("Price was increased by " + fmt.format(iPrice)
                                    + ", the new price is $"+ fmt2.format(c.getPrice()));
                    c.setPrice(c.getPrice());
                    break;
                case "R":
                    Double lPrice;
                    lPrice = sc.nextDouble();
                    c.reducePrice(lPrice);
                    System.out.println("Price was reduced by " + fmt.format(lPrice)
                                        + ", the new price is $" + fmt2.format(c.getPrice()));
                    break;
                case "P":
                    System.out.println(c.toString());
                    break;
                case "?":
                    System.out.println(displayMenu());
                    break;
                case "Q":
                    choice = "Q";
                    break;
                default:
                    System.out.println("\nUnknown Command\n");
                    break;
            }

        }while(!(choice.equals("Q") || choice.equals("q")));

    }

    //Display menu method.
    public static String displayMenu(){
        String s = "Choose an Action\n" +
                "-------------------\n" +
                "S \tChange Clothes Size\n" +
                "C \tChange Clothes Color\n" +
                "I \tIncrease the Price\n" +
                "R \tReduce the Price\n" +
                "P \tPrint Clothes Info\n" +
                "? \tDisplay the Menu\n" +
                "Q \tExit Program\n";

        return s;
    }

}

