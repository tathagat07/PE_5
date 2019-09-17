package com.stackroute;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringSplit {
    public String splitString(String s) {
        s=s.replaceAll("[^a-zA-Z0-9 ]"," ");
        List<String> arr= Arrays.asList(s.split("[\\W]+"));
        for(int i=0;i<arr.size();i++)
        {
            arr.get(i).trim();
            System.out.println(arr.get(i).trim());
        }
        Map<String,Integer> m = new HashMap<>();
        for(String i: arr)
        {
            if(m.containsKey(i))
                m.replace(i,m.get(i)+1);
            else
                m.put(i,1);
        }
        return m.toString();
    }
}
