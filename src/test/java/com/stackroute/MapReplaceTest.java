package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapReplaceTest {

       MapReplace mapReplace;
        @Before
        public void setUp()  {
            this.mapReplace=new MapReplace();
        }

        @After
        public void tearDown(){
            mapReplace=null;
        }

        @Test
        public void givenInputMapShouldRetunReplaceValue() {
            String expexted="{val2=java, val1= }";
            Map<String, String> map=new HashMap<>();
            map.put("val1","java");
            map.put("val2","c++");
            String actualInput=mapReplace.replaceValue(map);
            assertEquals(expexted,actualInput);
        }

        @Test
        public void givenInputMapShouldReturnReplaceValueSecond() {
            String expexted="{val2=mars, val1= }";
            Map<String, String> map=new HashMap<>();
            map.put("val1","mars");
            map.put("val2","saturn");
            String actualInput=mapReplace.replaceValue(map);
            assertEquals(expexted,actualInput);
        }

        @Test
        public void givenInputMapShouldRetunNull() {

            String actualInput=mapReplace.replaceValue(null);
            assertNull(actualInput);
        }
    }


