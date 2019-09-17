package com.stackroute;

import org.junit.*;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class SortedSetTest {

    private static SortedSet sortedSet;

    @BeforeClass
    public static void setUp() throws Exception {
        sortedSet= new SortedSet();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        sortedSet=null;
    }

    @Test
    public void sortArrayListUsingSet() {
        List<String> expected= Collections.singletonList("[Alice, Bluto, Eugene, Harry, Olive]");

        assertEquals(expected,sortedSet.sortArrayList("Harry Olive Alice Bluto Eugene"));
    }

    @Test
    public void sortArrayListUsingSortedSetNull() {


        assertNull( sortedSet.sortArrayList(null));
    }
}