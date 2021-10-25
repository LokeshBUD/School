import java.util.Random;

public class test {
    public static void main(String[] args){
        double grade = 70.0;
        String letterGrade = "F";

        if (grade >= 90)
            letterGrade = "A";
        if (grade >= 80)
            letterGrade = "B";
        if (grade >= 70)
            letterGrade = "C";
        if (grade >= 60)
            letterGrade = "D";

        System.out.println("Your letter grade is: " + letterGrade);    }
}
