package com.prolog.prob;

import java.util.List;
import java.util.stream.Stream;

public class LastElementOfList {


//    P01 (*) Find the last element of a list.
//    Example:
//            ?- my_last(X,[a,b,c,d]).
//    X = d

    public String getLastElementOfList(List<String> names) {
        long countList = names.stream().count();
        Stream<String> streamNames = names.stream();
        return names.stream().skip(countList - 1).findFirst().get();
    }



}
