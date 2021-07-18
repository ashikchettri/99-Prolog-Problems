package com.prolog.prob;

public class MyException extends Exception {


    private static int accountNo[] = {1002, 1003, 1004, 1005, 1006};
    private static String name[] = {"ashik", "mansubh", "Sagar", "suresh", "abhishek"};
    private static double bal[] = {100.22, 123.11, 123.00, 122.23, 112.02};


    //write a default constructor in its own excpetion class like this
    MyException() {
    }

    //Make a parameterized constructor with a string as a parameter. call superclass exception constructor
    // from this and send the string there
    MyException(String str) {
        super(str);
    }

    //To raise exception of user defined type, we need to create an object to his exception class and
    // throw it using a throw clause


    public static void main(String[] args) {

        try {


            System.out.println("Account" + "\t" + "Customer" + "\t" + "Balance");
            for (int i = 0; i <= 5; i++) {
                System.out.println(accountNo[i] + "\t" + name[i] + "\t" + bal[i]);
                if (bal[i] < 100) {
                    MyException me = new MyException("Balance is less then 100");
                    throw me;

                }
            }
        } catch (MyException e) {
            e.printStackTrace();
        }


    }

}
