package com.stackroute;


import java.util.*;

public class SortedSet {

        public List<String> sortArrayList(String string){
            if (string==null)return null;
            Set<String> sortedSet=new TreeSet<>(Arrays.asList(string.split(" ")));
            List<String> s = new ArrayList<>();
            s= Collections.singletonList((sortedSet).toString());
            return s;
        }

}

