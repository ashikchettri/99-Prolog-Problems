package com.prolog.prob;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapExample {


    /*Stream<String[]>   =>>> flatMap  ===>> Stream<String>
    Stream<Set<String>>  =>>> flatMap   ===>> Stream<String>
    Stream<List<String>>  =>>>> flatMap  ==>> Stream<String>
    Stream<List<Object>>  =>>> flatMap  =>>>>Stream<String>
    * */

    //flatMap works

//    {{1,2}, {3,4}, {5,6}}
//     {{"a","b"}, {"c", "d"}, {"e","f"}}


    public static void main(String[] args) {


        // 1) Stream + String[] + flatMap
        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
        //Stream<String[]>
        Stream<String[]> temp = Arrays.stream(data);
        Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));
        Stream<String> checkStream = stringStream.filter(x -> "a".equals(x.toString()));
        checkStream.forEach(System.out::println);

//        Stream<String> checkFlatMap = Arrays.stream(data)
//                .flatMap(x -> Arrays.stream(x))
//                .filter(x -> "b".equals(x.toString()))
//                .forEach(System.out::println);

    }

}