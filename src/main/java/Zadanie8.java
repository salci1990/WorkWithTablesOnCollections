import java.util.Arrays;
import java.util.List;

public class Zadanie8 {

    public void zadanie8() {

//        Napisz program, który policzy sumę wszystkich
//        elementów tablicy. Tablica zawiera liczby całkowite.

        Integer tab[] = new Integer[]{27, 2, 7, 11, 4, 18, 1, 5, 3};
        List<Integer> newTab = Arrays.asList(tab);
//        long sum = 0;
//        for (int value: newTab) {
//            sum += value;
//        }
        Integer sum = newTab.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);

    }
}
