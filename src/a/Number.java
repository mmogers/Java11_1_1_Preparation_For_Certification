/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 2: Packages and Import Statements
*/

package a;

//import java.lang.Number; //unnessessary import, Number bcomes a defined entity


// It is ok to create a class that is defined in java.lang
class Number {
    Number number;
    java.lang.Number numberj;

    Number(java.lang.Number number) {
        this.numberj = number;
        System.out.println("Constructor for java.lang.number");
    }

    Number(Number number) {
        this.number = number;
        System.out.println("Constructor for a.Number");
    }

    public static void main(String[] args) {

        Number n = new Number(10);
        Number n2 = new Number(n);

    }
}