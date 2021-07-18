package com.prolog.prob;

public class StringToInt {


    public static void main(String[] args) {

        String number = "10";

        // 1) convert string to integer using Integer.parse.Int
        int num = Integer.parseInt(number);
        System.out.println("the number is " + num);

        // 2) Integer.valueOf to convert the string into integer object

        int number2 = Integer.valueOf(number);
        System.out.println("The number converting the string into integer object is " + number2);

        //3) If the string cannot be converted to number then it will throw number format exception

        String num3 = "10r";
        int valueCheck = Integer.parseInt(num3);
        System.out.println("The parse value of num is " + valueCheck);

    }
}
