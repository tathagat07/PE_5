package com.stackroute;

import org.junit.*;

import static org.junit.Assert.*;

public class StringSplitTest {

    private static StringSplit stringSplit;

    @BeforeClass
    public static void setUp() throws Exception {
        stringSplit=new StringSplit();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        stringSplit=null;
    }

    @Test
    public void test_get_split(){
        assertEquals("{one=5, two=2, three=2}",stringSplit.splitString("one one -one___two,,three,one @three*one?two"));
    }
}