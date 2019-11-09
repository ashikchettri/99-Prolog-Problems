package com;

import com.prolog.prob.LastElementOfList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;

@RunWith(JUnitPlatform.class)
public class LastElementOfListTest {

    private LastElementOfList lastElementOfList;


    @BeforeEach
    public void testBeforeAll() {
        lastElementOfList = new LastElementOfList();
    }

    @Test
    @DisplayName("Get the last element of the list ")
    public void testGetLastElementofList() {

        List<String> names = Arrays.asList("ashik", "sagar", "kushal", "nischal");
        String actualResult = lastElementOfList.getLastElementOfList(names);
        String expectedResult = "nischal";
        Assertions.assertEquals(actualResult, expectedResult);
    }


}
