import java.util.Arrays;
import java.util.List;

public class Zadanie7 {

    public void zadanie7() {

//        Napisz program, który posortuje tablicę liczb
//        i program, który posortuje tablicę Stringów.

        Integer tab[] = new Integer[]{27, 2, 7, 11, 4, 18, 1, 5, 3};
        List<Integer> newTab = Arrays.asList(tab);
        newTab.stream().sorted().forEach(System.out::print);
    }
}
