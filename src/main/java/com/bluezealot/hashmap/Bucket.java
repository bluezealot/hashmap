package com.bluezealot.hashmap;

import java.util.List;

import lombok.Data;

@Data
public class Bucket<K,V> {
    private List<KeyValueEntity<K,V>> dataSet;

    public void add(KeyValueEntity<K,V> data) {
        dataSet.add(data);
    }

    public void remove(K key) {
        for(int i = 0; i < dataSet.size(); i ++){

        }
    }

    public KeyValueEntity<K,V> getData(K key) {
        return dataSet.stream().filter(data -> 
        key.equals(data.getKey()))
        .findAny()
        .get();
    }
}
