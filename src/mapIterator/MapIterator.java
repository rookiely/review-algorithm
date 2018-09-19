package mapIterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterator {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        /**
         * method1:用foreach
         */
        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        /**
         * method2：用Iterator（泛型/不用泛型都可以）
         * 另一个好处是，你可以在遍历时调用iterator.remove()来删除entries
         */
        Iterator<Map.Entry<Integer,Integer>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer,Integer> entry = entries.next();
            //entries.remove();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        /**
         * method3
         */
        for (Integer key : map.keySet()) {
            int val = map.get(key);
            System.out.println(key + ":" + val);
        }
    }
}
