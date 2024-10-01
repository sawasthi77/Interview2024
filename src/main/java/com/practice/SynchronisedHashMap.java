package com.practice;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronisedHashMap {
    private static void syncHashMap(){
        Map<String, String> synchronisedMap = Collections.synchronizedMap(new HashMap<>());

        synchronized(synchronisedMap){
         synchronisedMap.put("key","value");
         String value = synchronisedMap.get("key");
        }
    }
}
