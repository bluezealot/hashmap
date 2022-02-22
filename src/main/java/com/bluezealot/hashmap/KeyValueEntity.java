package com.bluezealot.hashmap;

import java.util.Comparator;

import lombok.Data;

@Data
public class KeyValueEntity <k extends Comparable,v> implements Comparable{
    private k key;
    private v value;

    @Override
    public boolean equals(Object o){
        return false;
    }

    @Override
    public int hashCode(){
        return 0;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
