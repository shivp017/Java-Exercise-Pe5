package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.*;

public class SortingSetTest {

    SortingSet sortingSet;

    @Before
    public  void setUp()
    {
        this.sortingSet=new SortingSet();
    }

    @After
    public void teardown(){
        this.sortingSet=null;
    }

    @Test
    public void givenInputStringShouldSortedString() {
        HashSet<String> set = new HashSet<String>();

        // Adding elements into HashSet using add()
        set.add("Harry");
        set.add("Alice");
        set.add("Bluto");
        set.add("Eugene");
        HashSet<String> expected=new HashSet<String>();
        expected.add("Alice");
        expected.add("Bluto");
        expected.add("Eugene");
        expected.add("Harry");
        HashSet<String> actualInput= (HashSet<String>) sortingSet.sortString(set);
        assertEquals(expected,actualInput);
    }
//("Alice","Bluto","Eugene","Harry")

}