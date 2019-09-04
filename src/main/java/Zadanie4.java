import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadanie4 {

    public void zadanie4() {
//    Napisz program, który pomnoży odpowiadające sobie elementy dwóch tablic.
//    Array1: [1, 3, -5, 4]
//    Array2: [1, 4, -5, -2]
//    Wynik: 1 12 25 -8

        Integer tab1[] = new Integer[]{1, 3, -5, 4};
        Integer tab2[] = new Integer[]{1, 4, -5, -2};

        List<Integer> newTab1 = Arrays.asList(tab1);
        List<Integer> newTab2 = Arrays.asList(tab2);
        List<Integer> sum = new ArrayList<>();
        int value1 = 0;
        int value2 = 0;
//        int sum = 0;
        for (int i = 0; i < newTab1.size(); i++) {
            value1 = newTab1.get(i);
            value2 = newTab2.get(i);
            sum.add(value1 * value2);
        }
        System.out.println(sum);
    }
}
