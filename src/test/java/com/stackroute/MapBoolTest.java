package com.stackroute;

import org.junit.*;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapBoolTest {

    private static MapBool mapBool;

    @BeforeClass
    public static void setUp() throws Exception {
        mapBool =new MapBool();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        mapBool = null;
    }

    @Test
    public void testCount_bool()
    {
        String[] arr = new String[] {"a","b","c","d","a","c","c"};


        Map<String,Boolean> hm = new HashMap< String,Boolean>();
        hm.put("a", true);
        hm.put("b", false);
        hm.put("c", true);
        hm.put("d", false);



        assertEquals(hm.toString(),mapBool.checkOccur(arr));

    }

    @Test
    public void checkAppearanceNull() {

        String actual=mapBool.checkOccur(null);
        assertNull(actual);

    }
}