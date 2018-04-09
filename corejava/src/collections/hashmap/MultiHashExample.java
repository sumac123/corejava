package collections.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MultiHashExample {

    public static void main(String[] args) {

       // List<Entry<String,Integer>> list;
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("A", 4);
        map.put("A", 6);
        map.put("B", 7);
        map.put("C", 1);
        map.put("B", 9);
        map.put("A", 5);
/*
        Set entrySet = map.entrySet();
        Iterator<Entry<String,Integer>> it = entrySet.iterator();
        System.out.println("  Object key  Object value");
        while (it.hasNext()) {
            Entry<String,Integer> mapEntry = it.next();
            list =  mapEntry.getKey();
            for (int j = 0; j < list.size(); j++) {
                System.out.println("\t" + mapEntry.getKey() + "\t  " + list.get(j));
            }
        }*/
        
        List<Entry<String,Integer>> list=new LinkedList<Map.Entry<String,Integer>>(map.entrySet());
        for(Entry<String,Integer> es:list){
        	
        }
        
    }
}