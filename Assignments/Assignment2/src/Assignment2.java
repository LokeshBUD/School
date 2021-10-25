//**************************************************************************
// FILE: Assignment2.java
// Name: Lokesh Budda Sankar Narayan
// Student ID: 1222415142
// Description: takes user input for gym membership costs at different
//              memberships.
// Course: ASU CSE110 Principles of Programming with Java
//***************************************************************************
import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args){
        /*
            Fields section.
         */
        String name;

        Integer categoryNum, people;
        Double priceOfMembership = 44.50, priceOfShirt = 24.99,
                groupShirtCharge, totalCharge, deliveryCharge = 0.00,
                pricePerPerson = 0.00;

        char yesOrNo, deliveredYesOrNo = 0;

        Double priceAt1 = priceOfMembership,
                priceAt2 = 3*(priceOfMembership*.9),
                priceAt3 = 6*(priceOfMembership*.85),
                priceAt4 = 12*(priceOfMembership*.8);

        /*
            Display String for the categories
         */
        String displayFirst = "***** Mountainside Fitness Center Program *****\n" +
                "Category #1\tMonth-To-Month Membership\t$44.50 per month\n" +
                "Category #2\t3-Month Membership\t\t10% discount\n" +
                "Category #3\t6-Month Membership\t\t15% discount\n" +
                "Category #4\t12-Month Membership\t\t20% discount";
        System.out.println(displayFirst);

        /*
            User input section.
         */
        Scanner sc = new Scanner(System.in);
//        System.out.println("Customer Name:");
        name = sc.nextLine();
//        System.out.println("Pick membership category (enter 1~4):");
        categoryNum = sc.nextInt();
//        System.out.println("Number of people:");
        people = sc.nextInt();
//        System.out.println("Do you want to purchase group sport shirts for each member?(Y/N):");
        yesOrNo = sc.next().charAt(0);

        //Determines which categories the customer is in.
        switch(categoryNum){
            case 1 : priceOfMembership = priceOfMembership;
                break ;
            case 2 : priceOfMembership = 3*(priceOfMembership*0.9);
                break;
            case 3 : priceOfMembership = 6*(priceOfMembership*0.85);
                break;
            case 4 : priceOfMembership = 12*(priceOfMembership*0.8);
                break;
            default: priceOfMembership = 44.50*people;
                break;
        }

        //Checks to see if they chose to get shirts or not.
        if(yesOrNo == 'Y'|| yesOrNo == 'y'){
            deliveryCharge = 4.99;
//            System.out.println("Do you want the shirts delivered?(Y/N):");
            //User input for delivery charge.
            deliveredYesOrNo = sc.next().charAt(0);
        }

        //Switch statement for group shirt yes or no.
        switch(yesOrNo){
            case 'Y': groupShirtCharge = people*priceOfShirt;
                break;
            case 'y': groupShirtCharge = people*priceOfShirt;
                break;
            case 'N': groupShirtCharge = 0.00;
                break;
            case 'n': groupShirtCharge = 0.00;
                break;
            default:groupShirtCharge = 0.00;
                break;
        }

        //delivery charge yes or no. sets price.
        switch (deliveredYesOrNo){
            case 'y': deliveryCharge *= people;
                break;
            case 'Y': deliveryCharge *= people;
                break;
            case 'n': deliveryCharge = 0.00;
                break;
            case 'N': deliveryCharge = 0.00;
                break;
        }
        //restricts max delivery charge to $50
        if(deliveryCharge > 50.00){
            deliveryCharge = 50.00;
        }

        //Used for finding price per person for the different categories.
        if(categoryNum == 1){
            pricePerPerson = priceAt1;
        }else if(categoryNum == 2){
            pricePerPerson = priceAt2;
        }else if(categoryNum == 3){
            pricePerPerson = priceAt3;
        }else if(categoryNum == 4){
            pricePerPerson =  priceAt4;
        }

        //formats the prices to only have up to 2 decimals.
        DecimalFormat fmt = new DecimalFormat("0.00");

        double pricePerPersonTotal = people * priceOfMembership;
        totalCharge = pricePerPersonTotal + groupShirtCharge + deliveryCharge;

       /*
            Display section.
        */
        String s = "======================================\n"
                + "Mountainside Fitness Center Invoice\n\n"
                + "Customer: " + name + "\n"
                + people + " people @ $" + fmt.format(pricePerPerson) + " each = $"
                + fmt.format(pricePerPersonTotal) +"\n"
                + "Group shirt charge = $" + fmt.format(groupShirtCharge) +"\n"
                + "Delivery charge = $" + fmt.format(deliveryCharge)+ "\n"
                + "Total amount due = $"+ fmt.format(totalCharge);

        System.out.println(s);





    }
}
