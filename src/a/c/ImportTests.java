/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 2: Import statements
*/

package a.c;

import java.lang.*;  // This is redundant but OK, always included

import a.b.PackageTests;
import a.c.ImportTests; // This is redundant but OK, code will compile

//import a.*; //this includes classes defined in a but not a.b !!!!!!!!!!!!


public class ImportTests {
    public static void main(String[] args) {
        System.out.println("Import Tests");
        PackageTests.main(args);// package does not exist- compiler error because a.* doesn't include a.b
    }
}