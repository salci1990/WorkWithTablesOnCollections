import java.util.Arrays;
import java.util.List;

public class Zadanie6 {

    public void zadanie6() {

//        Napisz program, który przesunie wszystkie elementy tablicy o jedno
//        miejsce w lewo. Tablica składa się z liczb całkowitych. Rozmiar tablicy = 3
//
//        tab: [20, 30, 40]
//        newTab: [30, 40, 20]

        Integer tab[] = new Integer[]{20, 30, 40};
        List<Integer> newTab = Arrays.asList(tab);
        int value = 0;
        for (int i = 0; i < newTab.size(); i++) {
            if (i > 0) {
                value = newTab.get(i);
                newTab.set(i, newTab.get(i - 1));
                newTab.set(i - 1, value);
            }
        }
        System.out.println(newTab);
    }
}
