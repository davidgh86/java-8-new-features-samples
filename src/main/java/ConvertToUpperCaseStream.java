import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUpperCaseStream {

    public static void main(String[] args) {

        String[] strings = new String[] {
                "dfas","dfasdf","weqrwe","qewrqwe","","qewrq","qerwq","qerqw","ewqrweq","eqwrewq","fgdhdft"
        };
        List<String> list = Arrays.asList(strings);
        System.out.println(upperCase(list));
    }

    private static List<String> upperCase(List<String> list) {
        return list.stream().map(s-> s.toUpperCase()).collect(Collectors.toList());
    }
}
