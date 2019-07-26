package com.stackroute.pe;

import java.util.HashMap;
import java.util.Map;

public class BooleanMap {

    public Map<String, Boolean> countElements(String[] input) {

      int[] count ={0,0,0,0};

        int length = input.length;
        for (int i = 0; i < length; i++) {
            if (input[i] == "a") {
                 count[0]++;
            }
            else if (input[i] == "b") {
                 count[1]++;
            }
            else if(input[i]=="c"){
                 count[2]++;
            }
            else if(input[i]=="d"){
                 count[3]++;
            }

        }
        Map result=new HashMap();
        int len=count.length;
        for(int i=0;i<len;i++){
            if(count[i]>1){
                result.put(input[i],true);
            }
            else
                result.put(input[i],false);
        }
         return result;
    }
}