import java.util.Arrays;
import java.util.List;

public class Zadanie14 {

    public void zadanie14(int n) {

//        Napisz program, który znajdzie wszystkie pary liczb,
//        których suma jest równa innej liczbie.
//
//                suma = 6
//        tab = 1,2,3,4,5,6
//
//        result = 1,5 - 2,4

        Integer tab[] = new Integer[]{1, 2, 3, 4, 5, 6, 12, 10, 8, 15, 10};
        List<Integer> newTab = Arrays.asList(tab);

        for (int value1 : newTab) {
            for (int value2 : newTab) {
                if (value1 + value2  == n) {
                    System.out.println("First value: " + value1 + " Second value: " + value2);
                }
            }
        }
    }
}
