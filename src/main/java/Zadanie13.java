import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Zadanie13 {

    public void zadanie13() {

//        Napisz program, który znajdzie drugi najmniejszy element w tablicy
//        zaiwerającej liczby całkowite.
//
//        tab = 1,2,3,4,5,6,7,8,9
//        result = 8

        Integer tab[] = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> newTab = Arrays.asList(tab);
        List<Integer> convertTab = new ArrayList<>();
        Integer max = newTab
                .stream()
                .mapToInt(v -> v)
                .max().orElseThrow(NoSuchElementException::new);
        System.out.println("Max: " + max);

        for (int value : newTab) {
            if (value == max) {
                continue;
            } else {
                convertTab.add(value);
            }
        }
        Integer secondMaxValue = convertTab
                .stream()
                .mapToInt(v -> v)
                .max().orElseThrow(NoSuchElementException::new);
        System.out.println("SecondMaxValue: " + secondMaxValue);
    }
}

