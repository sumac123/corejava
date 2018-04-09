package collections.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapPractice {



    public static void main(String[] args) {

        List list;
       // MultiValueMap map = new MultiValueMap();
        
        
    //    Multimap map = ArrayListMultimap.create();
        Map map=new HashMap();
        map.put("A", 4);
        map.put("A", 6);
        map.put("B", 7);
        map.put("C", 1);
        map.put("B", 9);
        map.put("A", 5);
 System.out.println(map);
        Set entrySet = map.entrySet();
        Iterator it = entrySet.iterator();
        System.out.println("  Object key  Object value");
       /* while (it.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) it.next();
            list = (List) map.get(mapEntry.getKey());
            for (int j = 0; j < list.size(); j++) {
                System.out.println("\t" + mapEntry.getKey() + "\t  " + list.get(j));
            }
        }*/
    }
}

