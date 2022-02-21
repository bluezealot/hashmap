package com.bluezealot.hashmap;


public class HashMap implements Map<String, String>{
    private int seed = 37;
    private Bucket<String, String>[] localBuckets = new Bucket[seed + 1];

    @Override
    public void add(String key, String value) {
        int hashCode = key.hashCode() % seed;
        KeyValueEntity<String, String> newEntity = new KeyValueEntity<>();
        newEntity.setKey(key);
        newEntity.setValue(value);
        if(localBuckets[hashCode] != null){
            localBuckets[hashCode].add(newEntity);
        } else {
            Bucket<String,String> newBucket = new Bucket<>();
            newBucket.add(newEntity);
            localBuckets[hashCode] = newBucket;
        }
    }

    @Override
    public String get(String key) {
        int hashCode = key.hashCode() % seed;
        Bucket<String, String> bucket = localBuckets[hashCode];
        if(bucket != null){
            return bucket.getData(key).getValue();
        }
        return null;
    }
    
}
