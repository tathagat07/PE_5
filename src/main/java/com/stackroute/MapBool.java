package com.stackroute;

import java.util.HashMap;
import java.util.Map;

public class MapBool {
    public String checkOccur(String[] s)
    {
        if(s==null) return null;

        Map<String,Integer> m=new HashMap<>();
        for(String i:s)
        {
            if(m.containsKey(i))
            {
                m.replace(i,m.get(i)+1);
            }
            else m.put(i,1);
        }
        Map<String,Boolean> map = new HashMap<>();
        for(String j:m.keySet())
        {
            if(m.get(j)>1)
            {
                map.put(j,true);
            }
            else map.put(j,false);
        }
        return map.toString();
    }
}
