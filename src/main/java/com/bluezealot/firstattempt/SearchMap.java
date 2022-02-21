package com.bluezealot.firstattempt;

import java.util.ArrayList;
import java.util.List;

import com.bluezealot.hashmap.Map;

public class SearchMap implements Map<String, String>{

    private List<String> keyList = new ArrayList<>();
    private List<String> valueList = new ArrayList<>();

    @Override
    public void add(String key, String value) {
        keyList.add(key);
        valueList.add(value);
        
    }

    @Override
    public String get(String key) {
        int hitKeyIndex = keyList.indexOf(key);
        if(hitKeyIndex >= 0){
            return valueList.get(hitKeyIndex);
        }
        return null;
    }
    
}
