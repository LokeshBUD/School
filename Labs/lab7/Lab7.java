/*-------------------------------------------------------------
// AUTHOR: Lokesh Budda Sankar Narayan
// ASU ID: 1222415142
// FILENAME: Lab7.java and Student.java
// SPECIFICATION: pojo class practice. Main class calls on Student class
                  to display the inputted values.
//-----------------------------------------------------------*/
import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args){
        //Scanner object
        Scanner sc = new Scanner(System.in);
        //Variables
        String fName, lName, major, oldMajor;
        Integer points, credits,id;

        //Gets input for Student object
        fName = sc.nextLine();
        lName = sc.nextLine();
        major = sc.nextLine();
        id = sc.nextInt();
        points = sc.nextInt();
        credits = sc.nextInt();

        //Student object created
        Student s = new Student(id, fName,lName,major,points,credits);
        //Inserts user input into the parameters of the student object.
        s.setFirstName(fName);
        s.setLastName(lName);
        s.setMajor(major);
        s.setGradePoints(points);
        s.setStudentID(id);
        s.setTotalCredits(credits);

        //prints out student name and ID
        String str = "Student Name:\t" + s.fullName() + "\n\n"
                +"Student ID:\t" + s.getStudentID() + "\n\n";
        System.out.println(str);
        System.out.println(s.toString());
        oldMajor = s.getMajor();

        //Changes major but returns Invalid attempt because parameters don't fit the if-else
        s.changeMajor("Internationals affairs", 10,500);

        //Changes major to "International Affairs"
        s.changeMajor("International Affairs");
        System.out.println(s.fullName() + " has changed major from " + oldMajor + " to " + s.getMajor() + "\n");

        //Displays the object.
        System.out.println(s.toString());
    }
}
