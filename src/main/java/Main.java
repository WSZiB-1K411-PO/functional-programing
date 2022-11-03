import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /*List<Integer> numbers = new LinkedList<>();

        Stream.generate(Main::getNumber)
                .limit(10)
                .map(integer -> {
                    numbers.add(integer);
                    return integer;
                }).forEach(System.out::println);

        System.out.println(numbers);*/

        List<NumberWrapper> numbers = Stream.generate(Main::getNumber)
                .limit(10)
                .map(NumberWrapper::new)
                .map(number -> number.add(4))
                .collect(Collectors.toList());

        System.out.println(numbers);
    }

    public static int getNumber() {
        return ThreadLocalRandom.current().nextInt(10, 21);
    }
}
