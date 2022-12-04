package com.JavaCore.Collection;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Runner {
    public boolean isUnique(Map<String, String> map){
        Set<String> result = new HashSet<>(map.values());
        return map.size()==result.size();
    }
}
