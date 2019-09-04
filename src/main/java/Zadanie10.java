import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zadanie10 {

    public void zadanie10() {

//        Napisz program, który znajdzie maksymalną i
//        minimalną wartość w tablicy zawierającej liczby całkowite.

        Integer tab[] = new Integer[]{27, 2, 7, 11, 4, 18, 1, 5, 3};
        List<Integer> newTab = Arrays.asList(tab);
        System.out.println(newTab);

        Integer max = newTab
                .stream()
                .mapToInt(v -> v)
                .max().orElseThrow(NoSuchElementException::new);
        System.out.println("Max: " + max);

        Integer min = newTab
                .stream()
                .mapToInt(v -> v)
                .min().orElseThrow(NoSuchElementException::new);
        System.out.println("Min: " + min);
    }
}
