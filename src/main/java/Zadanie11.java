import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Zadanie11 {

    public void zadanie11() {

//        Napisz program, który znajdzie takie same wartości w tablicy liczb całkowitych.
//
//        tab = 1,2,3,2,3,4,5,6,6
//        tab2 = 2,3,6

        Integer tab[] = new Integer[]{1,2,3,2,3,4,5,6,6};

        List<Integer> numbers = Arrays.asList(tab);
        numbers.stream().filter(i -> Collections.frequency(numbers, i) >1)
                .collect(Collectors.toSet()).forEach(System.out::println);
    }
}
