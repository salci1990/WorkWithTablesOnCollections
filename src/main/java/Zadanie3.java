import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadanie3 {

    public void zadanie3() {
//    Mając dwie tablice napisz program, który utworzy trzecią tablicę,
//    dwuelementową, która będzie składała się z pierwszego elementu z
//    pierwszejtablicy i ostatniego elementu z drugiej tablicy.
//
//            Przykład:
//    tab1: [50, -20, 0, 10, 13, 17]
//    tab2: [5, -50, 10]
//    tab3: [50, 10]
        Integer tab1[] = new Integer[]{50, -20, 0, 10, 13, 17};
        Integer tab2[] = new Integer[]{5, -50, 10};
        List<Integer> newTab1 = Arrays.asList(tab1);
        List<Integer> newTab2 = Arrays.asList(tab2);
        List<Integer> newList = new ArrayList<>();
        newList.add(newTab1.get(0));
        newList.add(newTab2.get(newTab2.size() -1));
        System.out.println(newList);
    }
}
