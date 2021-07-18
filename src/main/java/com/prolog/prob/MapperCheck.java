package com.prolog.prob;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapperCheck {

    public class Product {
        private int id;
        private String name;
    }

    public static void main(String[] args) {


        Map<String, List<Product>> productList = new HashMap<>();

        Map<String, Integer> programmingLangage = new HashMap<>();
        programmingLangage.put("Flutter", 1);
        programmingLangage.put("Go Lang", 2);
        programmingLangage.put("Ios", 3);
        programmingLangage.put("HTML", 4);


        if (programmingLangage.containsKey("HTML")){
            System.out.println("yes we teach html");
        }else {
            System.out.println("no we dont teach html");
        }


        for (Map.Entry<String,Integer> entry: programmingLangage.entrySet()){
            System.out.format("%d %s courses%n classes", entry.getValue(), entry.getKey());
        }

        int sumvalue = 0;
        for (Integer value : programmingLangage.values()){
            sumvalue += value;
        }
        System.out.println("total sum of courses value is" + sumvalue);

        System.out.println("key set values as :- "+programmingLangage.keySet());

        System.out.println(programmingLangage.size());
        System.out.println("Number of courses " + programmingLangage.get("Ios"));

    }

    import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

    public class DevDictionary {

        @Inject
        private Map<String, String> dictionary;

        public DevDictionary() {
            dictionary = new HashMap<>();

            dictionary.put("SEO", "Search engine optimization");
            dictionary.put("SaaS", "Software as a service");
            dictionary.put("UX", "User experience");
        }

        public void runApp() {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Enter lookup word or Q to quit");
                String input = scanner.nextLine();
                if (input.toUpperCase().equals("Q")) {
                    System.out.println("Thanks for using Dev Dictionary");
                    return;
                }else if(dictionary.containsKey("Q")){
                    System.out.println("Word doesn't exist, try again or Q to quit");
                }
            }
        }

    }
}
}


        }
