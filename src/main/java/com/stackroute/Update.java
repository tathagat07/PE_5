package com.stackroute;

import java.util.List;

public class Update {
    public List<String> updateArray(List<String> a) {
        a.set(0,"Kiwi");
        a.set(2,"Mango");
        return a;
    }

    public List<String> clearArray(List<String> a) {
        a.clear();
        return a;
    }
}
