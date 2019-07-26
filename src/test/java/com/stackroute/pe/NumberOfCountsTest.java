package com.stackroute.pe;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class NumberOfCountsTest {

    NumberOfCounts noOfCounts;

    @Before

    public void setup(){
        noOfCounts=new NumberOfCounts();
    }

    @After
    public void tearDown(){
        noOfCounts=null;
    }



    @Test
    public void givenStringShouldReturnNoOfCounts(){
        String inputStr="one one -one___two,,three,one @three*one?two";
        Map expectedResult=new HashMap();
            expectedResult.put("one",5);
            expectedResult.put("two",2);
            expectedResult.put("three",2);

        Map count=noOfCounts.calulateCounts(inputStr);
        //assert
        assertEquals(expectedResult,count);

    }




}