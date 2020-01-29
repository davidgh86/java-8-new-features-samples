import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Supplier;
public class ConvertToUpperAndShortStream {public static void main(String[] args) {

List<String> myList =
    Arrays.asList("a1", "a2", "b1", "c2", "c1");

myList
    .stream()
    .filter(s -> s.startsWith("c"))
    .map(String::toUpperCase)
    .sorted()
    .forEach(System.out::println);

}}