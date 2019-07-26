package com.stackroute;

import java.util.Map;

/*5. Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
        Modify and return the given map as follows:
        a. If the key `val1` has a value, set the key `val2` to have that value, and
        b. Set the key `val1` to have the value `" "` (empty string).
        Example 1:
        The map {"val1": "java", "val2": "c++"} should return {"val1": " ", "val2":
        "java"}
        Example 2:
        The map {"val1": "mars", "val2": "saturn"} should return {"val1": " ", "val2":
        "mars"}

 */
public class MapReplace {

    //     If the key `val1` has a value, set the key `val2` to have that value, and
    //         Set the key `val1` to have the value `" "` (empty string).
    public String replaceValue(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        String val1 = map.get("val1");
        map.replace("val2", val1);
        map.replace("val1", " ");
        return map.toString();
    }

}
