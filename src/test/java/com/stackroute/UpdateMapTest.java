package com.stackroute;

import org.junit.*;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class UpdateMapTest {

    private static UpdateMap updateMap;

    @BeforeClass
    public static void setUp() throws Exception {
        updateMap=new UpdateMap();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        updateMap=null;
    }

    @Test
    public void test_update_map()
    {
        Map<String,String> m= new HashMap<>();
        m.put("val1","java");
        m.put("val2","c++");
        assertEquals("{val2=java, val1= }",updateMap.changeVal(m));
    }

    @Test
    public void test_update_map2()
    {
        Map<String,String> m= new HashMap<>();
        m.put("val1","mars");
        m.put("val2","saturn");
        assertEquals("{val2=mars, val1= }",updateMap.changeVal(m));
    }

    @Test
    public void test_null(){
        assertNull(updateMap.changeVal(null));
    }
}