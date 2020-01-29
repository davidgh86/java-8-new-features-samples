import java.util.Arrays;
import java.util.List;

public class AverageValueStream {

    public static void main(String[] args) {

        Integer[] spam = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        List<Integer> list = Arrays.asList(spam);
        System.out.println(average(list));
    }

    private static Double average(List<Integer> list) {
        return list.stream().mapToInt(i-> i).average().getAsDouble();
    }
}
