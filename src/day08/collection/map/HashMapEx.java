package day08.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("최문규", 100);
        map.put("이동휘", 100);
        map.put("신민혁", 100);
        System.out.println("map size = " + map.size());

        //key로 값 얻기
        String key = "이동휘";
        int value = map.get(key);
        System.out.println(value);

        //key set 컬렉션을 얻고, 반복해서 값을 얻기
        Set<String> keySet = map.keySet();

        Iterator<String> keyIter = keySet.iterator();
        while(keyIter.hasNext()) {
            String k = keyIter.next();
            Integer v = map.get(k);
            System.out.println("k = " + k + ", v = " + v);
            /*Object value1 = map.remove(k);
            System.out.println(value1);*/
        }

        for (String keys : keySet) {
            System.out.println(keys);
        }


    }
}
