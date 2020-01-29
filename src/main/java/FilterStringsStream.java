import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStringsStream {

    public static void main(String[] args) {

        String[] strings = new String[] {
                "dfas","dfasdf","weqrwe","qewrqwe","","qewrq","qerwq","qerqw","ewqrweq","eqwrewq","fgdhdft"
        };
        List<String> list = Arrays.asList(strings);
        System.out.println(search(list, "q", 4));
    }

    private static List<String> search(List<String> list, String startsWith, int numberOfCharacters) {
        return list.stream()
                .filter(s-> s.startsWith(startsWith))
                .filter(s-> s.length()==numberOfCharacters)
                .collect(Collectors.toList());
    }
}
