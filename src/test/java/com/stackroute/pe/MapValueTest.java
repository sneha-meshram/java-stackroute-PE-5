package com.stackroute.pe;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapValueTest {

    MapValue mapValue;

    @Before
    public void setup() {
        mapValue = new MapValue();
    }

    @After
    public void tearDown() {
        mapValue = null;
    }

    /* the given input map should return the modified map. */

    @Test
    public void givenMapShouldReturnTheModifyMap() {
        Map<String, Object> input = new HashMap<>();
        input.put("val1", "java");
        input.put("val2", "c++");
        Map<String, Object> output = new HashMap<>();
        output.put("val1", " ");
        output.put("val2", "java");
        //act
        Map<String, Object> actualResult = mapValue.modifyMap(input);
        //assert
        assertEquals(output, actualResult);
    }

    /* Should return the null pointer exception when the user gives null array as a input. */

    @Test(expected = NullPointerException.class)
    public void givenNullInputMapReturnstheMessage() {
     mapValue.modifyMap(null);
    }
}