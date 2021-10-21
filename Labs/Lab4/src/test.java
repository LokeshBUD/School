import java.text.DecimalFormat;
import java.util.Scanner;

public class test {
    public static void main(String[] args){
        DecimalFormat fmt1 = new DecimalFormat("###.000%");
        double x = 0.165467;
        System.out.println("x: " + fmt1.format(x));

        DecimalFormat fmt2 = new DecimalFormat("$##,###.##");
        double y = 7654321.7;
        System.out.println("y: " + fmt2.format(y));
    }

}
