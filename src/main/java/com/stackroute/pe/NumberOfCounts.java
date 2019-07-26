package com.stackroute.pe;


import java.util.*;

public class NumberOfCounts {

    public Map<String, Integer> calulateCounts(String inputStr) {

        int[] count = {0, 0, 0,};
        Map map = new HashMap();
        String str = inputStr.replaceAll("-|___|,|@|\\*|\\?", " ");
        str = str.replaceAll("  ", " ");
        System.out.println(str);
        String[] newstr = str.split(" ");
        System.out.println(Arrays.toString(newstr));
        for (int i = 0; i < newstr.length; i++) {
            if (newstr[i].matches("one")) {
                count[0]++;
            } else if (newstr[i].matches("two")) {
                count[1]++;
            } else if (newstr[i].matches("three")) {
                count[2]++;
            }
        }

        for (int i = 0; i <newstr.length; i++) {
            if(newstr[i].matches("one")){
                map.put(newstr[i],count[0]);
            }else if (newstr[i].matches("two")){
                map.put(newstr[i],count[1]);
        }else {
                map.put(newstr[i],count[2]);
            }

    }
        System.out.println(map);
        return map;
    }
}

