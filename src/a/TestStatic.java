/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 2: Testing Static Imports
*/

package a;

import a.d.StaticImportTest1; //imports class

import static a.d.StaticImportTest1.*; // all static methods of

import a.e.StaticImportTest2; //imports class

import static a.e.StaticImportTest2.APP_NAME; //now APP_NAME without class definition is for Test2 - more specific

public class TestStatic {

    public static void main(String[] args) {
        // APP_NAME in line below can be referenced without class name
        // because of import static statement.
        System.out.println("APP_NAME = " + APP_NAME);//referenced without the class name because of the import static statement

        // log method in line below can be referenced without class name
        // because of import static statement.
        log("This is StaticImportTest"); //referenced without the class name because of the import static statement

        // We instantiate StaticImportTest1() and execute a method on it
        new StaticImportTest1().printUniqueStatement();

        // APP_NAME in line below qualified by class name
        System.out.println("APP_NAME = " + StaticImportTest2.APP_NAME);

        // log method in line below qualified by class name
        StaticImportTest2.log("This is StaticImportTest");

        // We instantiate StaticImportTest2() and execute a method on it
        new StaticImportTest2().printUniqueStatement();

    }
}