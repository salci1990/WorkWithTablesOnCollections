import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadanie9 {

    public void zadanie9() {
        int n = 3;
        Integer tab[] = new Integer[]{27, 2, 7, 11, 4, 18, 1, 5, 3};
        List<Integer> newTab = Arrays.asList(tab);

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(newTab);
        numbers.remove(n);
        System.out.println(numbers);
    }
}

