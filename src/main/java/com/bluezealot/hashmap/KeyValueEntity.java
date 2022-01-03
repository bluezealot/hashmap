package com.bluezealot.hashmap;

import lombok.Data;

@Data
public class KeyValueEntity <k,v>{
    private k key;
    private v value;

}
