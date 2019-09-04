import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadanie1 {

    public void zadanie1() {

//    Napisz program, który sprawdzi czy pierwszy i ostatni
//    element tablicy zawierającej liczy (int) są takie same.
//    Tablica musi mieć minimum dwa elementy.
//
//    tablica = 50, -20, 0, 30, 40, 60, 10
//    rezultat - false
//
//    tablica = 12, -20, 0, 30, 40, 60, 12
//    rezultat - true
        int value1 = 0;
        int value2 = 0;
        Integer tab1[] = new Integer[]{10, -20, 0, 30, 40, 60, 10};
        List<Integer> newTab = Arrays.asList(tab1);
        int first = newTab.get(0);
        int last = newTab.get(newTab.size() -1);
        System.out.println(first);
        System.out.println(last);
        System.out.println(first == last);

        System.out.println("");
        System.out.println(newTab.get(0).equals(newTab.get(newTab.size() -1)));



    }
}
