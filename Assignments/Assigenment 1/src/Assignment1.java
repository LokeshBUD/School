//**************************************************************************
// FILE: Assignment1.java
// Name: Lokesh Budda Sankar Narayan
// Student ID: 1222415142
// Description: a demonstration of scanner, decimal format, if-else in
//              one program
// Course: ASU CSE110 Principles of Programming with Java
//***************************************************************************
import java.util.Scanner;
import java.text.DecimalFormat;

public class Assignment1 {

    public static void main(String[] args){
        //fields
        String name, address;
        Integer age;
        Double tax_per_100, propertyTax, qtlyPaynment, seniorExpem,propertyValue;
        Double assessedValue;
        //Scanner object
        Scanner sc = new Scanner(System.in);

        //User input - commented out for Gradescope.
//        System.out.println("Enter Owner's name:");
        name = sc.nextLine();
//        System.out.println("Enter property's address:");
        address = sc.nextLine();
//        System.out.println("Enter home owner's age:");
        age = sc.nextInt();
//        System.out.println("Enter the actual property value: $");
        propertyValue = sc.nextDouble();
//        System.out.println("Enter the amount of tax per $100 of assessed value: $");
        tax_per_100 = sc.nextDouble();

        assessedValue = propertyValue*.6;

        seniorExpem = 5000.00;

        //checks if the owner is equal to or above the age of 65
        if (age >= 65){
            assessedValue -= 5000;
            seniorExpem = 5000.00;
        }else {
            assessedValue = assessedValue;
            seniorExpem = 0.00;
        }

        tax_per_100 = tax_per_100/100;
        propertyTax = assessedValue*tax_per_100;
        qtlyPaynment = propertyTax/4;

        //decimal format used for display
        DecimalFormat fmt = new DecimalFormat("0.00");
        fmt.setGroupingUsed(true);
        fmt.setGroupingSize(3);
        String s = "****** Maricopa County Property Tax Report ******\n" +
                "Owner:\t\t" + name +"\n"
                +"Address:\t" + address +"\n"
                +"Age:\t\t" + age +"\n\n"
                +"Property Value:\t$" + fmt.format(propertyValue)+ "\n"
                +"Assessed Value:\t$" + fmt.format(assessedValue)+ "\n"
                +"Senior Exemp: \t$" +  fmt.format(seniorExpem) + "\n"
                +"Property Tax: \t$" + fmt.format(propertyTax) + "\n"
                +"Qtly Payment: \t$" + fmt.format(qtlyPaynment) ;

        //displaying result
        System.out.println(s);
        //closing scanner object.
        sc.close();
    }
}
