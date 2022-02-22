package com.bluezealot.hashmap;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Bucket<K extends Comparable,V> {
    private List<KeyValueEntity<K,V>> dataSet = new ArrayList<>();
    private TreeSet<KeyValueEntity> treeDataSet = new TreeSet();

    public void add(KeyValueEntity<K,V> data) {
        
    }

    public KeyValueEntity<K,V> getData(K key) {
        return null;
    }
}
