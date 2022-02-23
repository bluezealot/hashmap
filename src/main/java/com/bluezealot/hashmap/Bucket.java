package com.bluezealot.hashmap;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Bucket<K extends Comparable,V> {
    // private List<KeyValueEntity<K,V>> dataSet = new ArrayList<>();
    private TreeSet<KeyValueEntity> treeDataSet = new TreeSet();

    public void add(KeyValueEntity<K,V> data) {
        // dataSet.add(data);
        treeDataSet.add(data);
    }

    public KeyValueEntity<K,V> getData(K key) {
        KeyValueEntity<K,V> search = new KeyValueEntity<K,V>();
        search.setKey(key);
        return treeDataSet.ceiling(search);
        // return dataSet.stream().filter(data -> 
        // key.equals(data.getKey()))
        // .findAny()
        // .get();
    }
}
