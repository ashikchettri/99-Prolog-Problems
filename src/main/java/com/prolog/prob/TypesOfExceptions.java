package com.prolog.prob;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class TypesOfExceptions {

    public static void main(String[] args) {

        checkArithmeticExceptions();
        checkNullPointerExceptions();
        checkStringIndexOutOfBoundExceptions();
        checkFileNotFoundException();
        checkNumberFormatExceptions();
        checkArrayIndexOutOfBoundException();
    }


    public static void checkArithmeticExceptions() {

        // 1) Arithmetic Exceptions checked
        try {

            int a = 30, b = 0;
            int c = a / b;               //cannot divide by zero
            System.out.println("the value is " + c);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide the number by 0");
        }
    }

    public static void checkNullPointerExceptions() {

        // 2) Null pointer Exception checked
        try {

            String a = null;
            System.out.println(a.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception found");
        }

    }

    public static void checkStringIndexOutOfBoundExceptions() {

        // 3) String Index out of bound exception checked

        try {

            String a = "This is what you have to do right away";
            char c = a.charAt(55);
            System.out.println("The character at this position is " + c);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("pls check the index of the string and found StringIndexOutOfBoundsExceptions");
        }
    }

    public static void checkFileNotFoundException() {

        // 4) Check FileNotFoundException here

        try {
            File file = new File("c://ashik/transactions.csv");
            FileReader read = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("The file doesn't exist in mentioned locations");
        }
    }

    public static void checkNumberFormatExceptions() {

        // 5) NumberFormatExceptions check here

        try {

            int checkNumber = Integer.parseInt("seeker");
            System.out.println(checkNumber);
        } catch (NumberFormatException e) {
            System.out.println("The input value is not integer..Pls change to Int");
        }

    }

    public static void checkArrayIndexOutOfBoundException() {

        //6) Array Index Out of Bound Exception check here

        try {

            int[] num = new int[4];
            num[4] = 32;
            System.out.println(num[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The index doesnt exist.Pls check the index of array");
        }

        //accessing 7th element in an array of size 5

    }

}
