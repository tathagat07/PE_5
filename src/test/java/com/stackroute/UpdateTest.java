package com.stackroute;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;



public class UpdateTest {

    private static Update update;

    @BeforeClass
    public static void setUp() throws Exception {

        update=new Update();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        update=null;
    }

    @Test
    public void test_update_array()
    {
        List<String> a= new ArrayList<>();
        a.add("Apple");
        a.add("Grape");
        a.add("Melon");
        a.add("Berry");
        List<String> b= new ArrayList<>();
        b.add("Kiwi");
        b.add("Grape");
        b.add("Mango");
        b.add("Berry");
        List<String> c = new ArrayList<>();

        assertEquals(b,update.updateArray(a));
    }

    @Test
    public void test_clear_array()
    {

        List<String> a= new ArrayList<>();
        a.add("Apple");
        a.add("Grape");
        a.add("Melon");
        a.add("Berry");

        List<String> c = new ArrayList<>();

        assertEquals(c,update.clearArray(a));
    }
}