package com.bluezealot.hashmap;

import java.util.ArrayList;
import java.util.List;

public class Bucket<K,V> {
    private List<KeyValueEntity<K,V>> dataSet = new ArrayList<>();

    public void add(KeyValueEntity<K,V> data) {
        dataSet.add(data);
    }

    public KeyValueEntity<K,V> getData(K key) {
        return dataSet.stream().filter(data -> 
        key.equals(data.getKey()))
        .findAny()
        .get();
    }
}
