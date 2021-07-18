package com.prolog.prob;

import java.util.List;
import java.util.stream.Stream;

public class Problems {


//    P01 (*) Find the last element of a list.
//    Example:
//            ?- my_last(X,[a,b,c,d]).
//    X = d

    public String getLastElementOfList(List<String> names) {
        long countList = names.stream().count();
        Stream<String> streamNames = names.stream();
        return names.stream().skip(countList - 1).findFirst().get();
    }

    //  P02 (*) Find the last but one element of a list.

    public String getSecondLastElementOfList(List<String> name) {
        long countName = name.stream().count();
        Stream<String> streamName = name.stream();
        return name.stream().skip(countName - 2).findFirst().get();

    }

//    Find the K'th element of a list.
//The first element in the list is number 1.
//    Example:
//            ?- element_at(X,[a,b,c,d,e],3).
//    X = c


    public void getKelementOfList(){}




}
