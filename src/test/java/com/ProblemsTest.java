package com;

import com.prolog.prob.Problems;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;

@RunWith(JUnitPlatform.class)
public class ProblemsTest {

    private Problems problems;


    @BeforeEach
    public void testBeforeAll() {
        problems = new Problems();
    }

    @Test
    @DisplayName("Get the last element of the list ")
    public void testGetLastElementofList() {

        List<String> names = Arrays.asList("ashik", "sagar", "kushal", "nischal");
        String actualResult = problems.getLastElementOfList(names);
        String expectedResult = "nischal";
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    @DisplayName("Check the second last value of the list element")
    public void testGetSecondLastElementOfList() {
        List<String> name = Arrays.asList("check", "make", "deck");
        String actualList = problems.getSecondLastElementOfList(name);
        String expectedList = "make";
        Assertions.assertEquals(actualList, expectedList);
    }

    @Test
    @DisplayName("Find the k element of the list")
    public void testGetKelementOfList(int k) {
        List<String> words = Arrays.asList("a","b","c","d");
    }


}
