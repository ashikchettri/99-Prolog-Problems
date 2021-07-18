package com.prolog.prob;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.prolog.model.Staff;

import java.io.File;
import java.io.IOException;

public class ParseJsonToJavaObject {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {

            //json file to Java object
            mapper.readValue(new File("staff.json"), Staff.class);

            //json string to java java object
            String jsonInString = "{\"name\":\"ashik\", \"age\":37, \"skills\":[\"java\", \"python\"]}";
            Staff staff2 = mapper.readValue(jsonInString, Staff.class);

            //compact print
            System.out.println(staff2);

            //pretty print
            String preetyStaff2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff2);
            System.out.println(preetyStaff2);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
