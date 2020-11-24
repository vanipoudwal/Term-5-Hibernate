
package com.learning.mapping;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo
{
    public static void main(String[] args)
    {
        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("Apple", 200);
        fruits.put("Banana", 50);
        fruits.put("Mango", 20);
        fruits.put("Guava", 30);
        fruits.put("Apple", 500);
        fruits.put("Mango", 250);
        fruits.put("Plum", 150);
        fruits.put("Strawberry", 300);
        
        // Enhanced For Loop
        for(Map.Entry<String, Integer> entry : fruits.entrySet())
        {
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }
    }
}
