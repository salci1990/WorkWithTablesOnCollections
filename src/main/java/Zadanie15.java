import java.util.Arrays;
import java.util.List;

public class Zadanie15 {

    public void zadanie15() {

//        Napisz program, który policzy wszystkie liczby parzyste i
//        nieparzyste w tablicy zawierającej liczby całkowite.
//
//                tab = 2,3,4,5,6
//
//        parzyste = 3
//        nieparzyste = 2

        Integer tab[] = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> newTab = Arrays.asList(tab);
        int counter1 = 0;
        int counter2 = 0;
        for (int value1 : newTab) {

            if (value1 % 2 == 0) {
                counter1 += value1;
            } else {
                counter2 += value1;
            }
        }
        System.out.println("Nieparzyste: " + counter1 + " Parzyste: " + counter2);
    }
}
