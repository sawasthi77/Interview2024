package StreamAPIPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BoxedArrayToStream {

    public static void main(String[] args) {

        String[] array = {"walt","jesse","dan"};
        Stream<String> stream = boxedArrayToArray(array);
        System.out.println(Arrays.toString(stream.toArray()));

        int[] array1 = {1,2,3,45};
        System.out.println(Arrays.toString(primitiveArrayToStream(array1).toArray()));

    }

    private static <T> Stream <T> boxedArrayToArray(T[] array){
        return Arrays.stream(array);
    }

    private static IntStream primitiveArrayToStream(int[] array){
        return Arrays.stream(array);
    }

    private static int[] streamToIntArray(List<Integer> list){
        return list.stream().mapToInt(x -> x).toArray();
    }
}
