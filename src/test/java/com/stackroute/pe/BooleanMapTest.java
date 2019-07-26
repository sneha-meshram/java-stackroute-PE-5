package com.stackroute.pe;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class BooleanMapTest {

    BooleanMap mapBoolean;

    @Before
    public void setup(){
        mapBoolean=new BooleanMap();
    }

    @After
    public void tearDown(){
        mapBoolean=null;
    }

    /*
    Given input array should return the result in boolean true if the number of appearance of array
     elements is more than one time, else false.
    */

    @Test
    public void givenInputStringArrayReturnsTheCountValueAsABoolean(){
        String[] input={"a","b","c","d","a","c","c"};
        Map<String,Boolean> output=new HashMap<>();
        output.put("a",true);
        output.put("b",false);
        output.put("c",true);
        output.put("d",false);

        Map<String,Boolean> actualResult=mapBoolean.countElements(input);
        //assert
        assertEquals(output,actualResult);

    }

    /* Should return the null pointer exception when the user gives null array as a input. */

    @Test(expected = NullPointerException.class)
    public void givenNullInputStringReturnsNullPointerException(){
               Map<String,Boolean> actualResult=mapBoolean.countElements(null);

    }


}