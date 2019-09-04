import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Zadanie5 {

    public void zadanie5() {
//    Napisz program, który zamieni pierwszy i ostatni element w tablicy.
//    Minimalna długość tablicy to 1 element.
//    Sample Output:
//    tab: [20, 30, 40]
//    newTab: [40, 30, 20]
        Integer tab[] = new Integer[]{20, 30, 40};
        List<Integer> newTab = Arrays.asList(tab);
        System.out.println(newTab);
        int value = 0;
        value = newTab.get(2);
        newTab.set(2, newTab.get(0));
        newTab.set(0, value);

        System.out.println(newTab);

//        newTab.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
    }
}
