package com.prolog.prob;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptions {

    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("c:ashik/content.txt");
        BufferedReader fileInput = new BufferedReader(fileReader);

        for (int counter = 0; counter < 3; counter++)
            System.out.println(fileInput.readLine());
        fileInput.close();

    }
}
