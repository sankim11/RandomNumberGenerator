import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomNumberGenerator {

    public static void main(String[] args) {
        List<Integer> randomNumbers = generateRandomNumbers(10000); // Generate 10,000 random numbers
        randomNumbers.forEach(System.out::println);
    }

    /**
     * Generate a list of random unique numbers x in the range of 1 >= x <= n (for this case n = 10,000)
     * @param n the upper bound of the range of numbers to generate
     * @return a list of shuffled, unique random numbers
     */
    public static List<Integer> generateRandomNumbers(int n) {
        List<Integer> numbers = IntStream.rangeClosed(1, n)
                                         .boxed()
                                         .collect(Collectors.toList());
        Collections.shuffle(numbers);
        return numbers;
    }
}
