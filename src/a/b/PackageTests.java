/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 2: Package statements
*/

//package ;//compiler error
//package default; //compiler error default a bad name for package
//package PackageTests; //compiler error, but the code runs, can have the same name as a class
package a.b;

public class PackageTests {
    public static void main(String[] args) {
        System.out.println("Package Tests");
    }
}