package StreamAPIPrograms;

import java.util.List;
import java.util.stream.Stream;

public class SlicingStream {

    public static void main(String[] args) {

    }

    private static <T> Stream<T> slicedStream(List<T> integers, int startIndex, int endIndex){
        return integers.stream().skip(startIndex).limit(endIndex - startIndex + 1);
    }
}
