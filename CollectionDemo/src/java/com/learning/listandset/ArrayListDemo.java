
package com.learning.listandset;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo
{
    public static void main(String[] args)
    {
        List<String> names = new ArrayList<>();
        names.add("Vani");
        names.add("Ruchit");
        names.add("Karan");
        names.add("Karan");
        names.add("Karan");
        names.add("Mamsi");
        names.add("Himanshu");
        
        // Enhanced For Loop
        for(String name: names)
        {
            System.err.println(name);
        }
        Iterator<String> it = names.iterator();
        
        while(it.hasNext())
        {
        System.out.println(it.next());
        }
    }
}
