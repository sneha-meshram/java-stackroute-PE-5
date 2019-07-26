package com.stackroute.pe;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayElementTest {

    ArrayElement arrayElement;

    @Before
    public void setup() {
        arrayElement = new ArrayElement();
    }

    @After
    public void tearDown() {
        arrayElement = null;
    }

    //to update specific array element by given element and should return the new array.

    @Test
    public void givenArrayListShouldReturnTheEmptyArrayList() {
        ArrayList oldArray = new ArrayList();
        oldArray.add("apple");
        oldArray.add("grape");
        oldArray.add("melon");
        oldArray.add("berry");
        ArrayList newArray=new ArrayList();
        //act
        ArrayList actualResult = arrayElement.emptyArray(oldArray,"kiwi","mango");
        //assert
        assertEquals(newArray,actualResult);
    }

    //the given array list should return the empty array list.

    @Test
    public void givenArrayElementShouldReturnUpdatedElement() {

        ArrayList oldArray = new ArrayList();
            oldArray.add("apple");
            oldArray.add("grape");
            oldArray.add("melon");
            oldArray.add("berry");

        ArrayList newArray = new ArrayList();
        newArray.add("kiwi");
        newArray.add("grape");
        newArray.add("mango");
        newArray.add("berry");

        //act
        ArrayList actualResult = arrayElement.updateArray(oldArray,"kiwi","mango");
        //assert
        assertEquals(newArray,actualResult);
    }

   // Given Null Array should Return the null array list as a message.

    @Test
    public void givenArrayListShouldReturnNullArrayMessage() {
        ArrayList oldArray = null;
        ArrayList expectedResult = new ArrayList();
        expectedResult.add("null Input");
        //act
        ArrayList actualResult = arrayElement.updateArray(oldArray,"kiwi","mango");
        //assert
        assertEquals(expectedResult, actualResult);
    }


}