package com.stackroute;

import java.util.*;

public class SortingSet {
    public Set<String> sortString(Set<String> set) {
        // Creating a HashSet



        // Sorting HashSet using List
        List<String> list = new ArrayList<String>(set);
        Collections.sort(list);
        return set;

    }
}
