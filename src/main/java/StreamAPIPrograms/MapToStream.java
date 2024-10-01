package StreamAPIPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MapToStream {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("abc", 1);
        map.put("xyz", 2);
        map.put("mnp", 3);
        map.put("stu", 4);

        System.out.println(Arrays.toString(convertMapToStream(map).toArray()));
        System.out.println(Arrays.toString(convertKeySetToStream(map).toArray()));
        System.out.println(Arrays.toString(convertMapValuesToStream(map).toArray()));
    }

    private static <K,V>Stream<Map.Entry<K,V>> convertMapToStream(Map<K,V> map){
        return map.entrySet().stream();
    }

    private static <K,V>Stream<K> convertKeySetToStream(Map<K,V> maps){
     return maps.keySet().stream();
    }

    private static <K,V>Stream<V> convertMapValuesToStream(Map<K,V> maps){
        return maps.values().stream();
    }
}
