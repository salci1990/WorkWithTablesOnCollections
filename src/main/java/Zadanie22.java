import java.util.Arrays;
import java.util.List;

public class Zadanie22 {

    public void zadanie22() {

//        Napisz program, który znajdzie liczby większe niż średnia wszystkich liczb w tablicy.
//
//                tab = [1, 4, 17, 7, 25, 3, 100]
//        średnia = 22.0
//        szukane liczby = 25 i 100

        Integer tab[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
        int sum = 0;
        int avg = 0;
        List<Integer> newTab = Arrays.asList(tab);
        for (int value : newTab) {
            sum += value;
        }
        avg = sum / newTab.size();
        for (int value : newTab) {
            if (value > avg) {
                System.out.println(value);
            }
        }
    }
}
