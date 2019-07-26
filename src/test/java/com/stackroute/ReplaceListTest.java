package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ReplaceListTest {


    ReplaceList replaceList;

    @Before
    public  void setUp(){

        this.replaceList=new ReplaceList();

    }

    @After
    public void tearDown(){
        this.replaceList=null;
    }

    @Test
    public void givenArrayListShouldReturnReplacedList() {
        ArrayList<String> inputList = new ArrayList(Arrays.asList("Apple", "Grape", "Melon", "Berry"));
        ArrayList<String> outputList = new ArrayList(Arrays.asList("Kiwi", "Grape", "Mango", "Berry"));
        ArrayList<String> actualResult = replaceList.replaceElement(inputList);
        assertEquals(outputList, actualResult);
    }
        @Test
        public void givenArrayListShouldReturnNull() {
            ArrayList<String> inputList1 = new ArrayList(Arrays.asList("Apple", "Grape", "Melon", "Berry"));
            ArrayList<String> outputList1 = new ArrayList(Arrays.asList());
            ArrayList<String> actualResult1 = replaceList.nullListElement(inputList1);
            assertEquals(outputList1, actualResult1);
        }

}