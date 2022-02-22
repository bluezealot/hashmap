package com.bluezealot.hashmap;

import java.util.Comparator;

import lombok.Data;

@Data
public class KeyValueEntity <k extends Comparable,v> implements Comparable{
    private k key;
    private v value;

    @Override
    public boolean equals(Object o){
        KeyValueEntity<k,v> target = (KeyValueEntity<k,v>)o;
        return this.key.equals(target.key);
    }

    @Override
    public int hashCode(){
        return key.hashCode();
    }

    @Override
    public int compareTo(Object o) {
        return key.compareTo(((KeyValueEntity)o).getKey());
    }
}
