package com.stackroute;

import java.util.Map;

public class UpdateMap {
    public String changeVal(Map<String, String> m) {
        if(m==null)
            return null;
        m.replace("val2",m.get("val1"));
        m.replace("val1"," ");
        return m.toString();
    }
}
