package com.bluezealot.hashmap;


public class HashMap implements Map<String, String>{
    private int seed = 173;
    private Bucket<String, String>[] localBuckets = new Bucket[seed + 1];

    @Override
    public void add(String key, String value) {
    }

    @Override
    public String get(String key) {
        return null;
    }
    
}
