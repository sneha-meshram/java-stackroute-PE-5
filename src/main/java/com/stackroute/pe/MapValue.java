package com.stackroute.pe;

import java.util.Map;

public class MapValue {

    public Map<String, Object> modifyMap(Map<String, Object> input) {
        input.replace("val2",input.get("val1"));
        input.replace("val1"," ");
        return input;
    }
}
