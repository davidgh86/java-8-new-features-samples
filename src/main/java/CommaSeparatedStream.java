import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommaSeparatedStream {

    public static void main(String[] args) {

        Integer[] spam = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        List<Integer> list = Arrays.asList(spam);
        System.out.println(CommaSeparated(list));
    }

    private static String CommaSeparated(List<Integer> list) {
        return list.stream()
                .map(i-> i % 2 == 0 ? "e"+i:"o"+i)
                .collect(Collectors.joining(","));
    }
}
