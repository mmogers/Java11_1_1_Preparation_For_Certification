/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 2: Testing Import static statements.
*/
//single-static-import declaration
import static java.lang.Math.PI;

//a single-static-import declaration for static method
import static java.lang.Math.sqrt;

//a static-import-on-demand declaration for static variable
//import static java.lang.Math.*;


public class TestImportStatic {
    public static void main(String[] args) {
        int radius = 2;

        // We can use a static class variable on the Math class to
        // get the value of PI
        //double circumference = 2 * java.lang.Math.PI * radius;
        double circumference = 2 * PI * radius;
        System.out.println("circumference = " + circumference);

        // We can use a static class method on the Math class to
        // get the square root of a number
        //double sqrt81 = java.lang.Math.sqrt(81);
        double sqrt81 = sqrt(81);
        System.out.println("sqrt81 = " + sqrt81);
    }
}