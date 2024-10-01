package StreamAPIPrograms;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {
        Map<Integer, List<String> > map = new HashMap<>();

        map.put(1, Arrays.asList("1", "2", "3"));
        map.put(2, Arrays.asList("4", "5", "6"));

        List<String> s = flatten(map.values()).collect(Collectors.toList());
        System.out.println(s);

        String[] a = { "A", "B", "C" };
        String[] b = { "i", "J", "K" };
        System.out.println(Arrays.toString(flattenTwoStreams(a,b).toArray()));
    }

    private static <T>Stream<T> flatten(Collection<List<T>> values){
        return values.stream().flatMap(x -> x.stream());
    }

    private static <T>Stream<T> flattenTwoStreams(T[] a, T[]b){
        return Stream.of(a,b).flatMap(Arrays::stream);
    }
}
