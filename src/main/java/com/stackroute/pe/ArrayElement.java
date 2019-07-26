package com.stackroute.pe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayElement {

    public ArrayList updateArray(ArrayList oldArray,String str1,String str2) {

        if (oldArray == null) {
            ArrayList sendMesage = new ArrayList();
            sendMesage.add("null Input");
            return sendMesage;
        }

        int indexOfOldArrayApple=oldArray.indexOf("apple");
        int indexOfOldArrayMelon=oldArray.indexOf("melon");

        oldArray.set(indexOfOldArrayApple,str1);
        oldArray.set(indexOfOldArrayMelon,str2);
        return oldArray;
    }

    public ArrayList emptyArray(ArrayList oldArray, String kiwi, String mango) {
        oldArray.clear();
        return oldArray;
    }
}
