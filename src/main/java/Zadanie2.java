import java.util.Arrays;
import java.util.List;

public class Zadanie2 {

    public void zadanie2() {
//    Napisz program, który sprawdzi czy pierwszy i ostatni element
//    pierwszej tablicy zawierającej liczy (int) są takie same jak pierwszy
//    i ostatni element drugiej tablicy. Obie tablice zawierają liczy (inty)
//    i obie tablice muszą mieć minimum dwa elementy.
//
//    tablica1 = 50, -20, 0, 30, 40, 60, 10
//    tablica2 = 50, -20, 0, 30, 40, 60, 11
//    rezultat - false
//
//    tablica = 30, -20, 0, 30, 40, 60, 12
//    tablica = 30, -20, 0, 30, 40, 60, 12
//    rezultat - true

        Integer tab1[] = new Integer[]{30, -20, 0, 30, 40, 60, 12};
        Integer tab2[] = new Integer[]{30, -20, 0, 30, 40, 60, 12};
        List<Integer> newTab1 = Arrays.asList(tab1);
        List<Integer> newTab2 = Arrays.asList(tab2);
        System.out.println("tab1[0] " + newTab1.get(0) + " tab2[0] " + newTab2.get(0));
        System.out.println("tab1[size-1] " + newTab1.get(newTab1.size() -1) + " tab2[size-1] " + newTab2.get(newTab2.size()-1));
        if(newTab1.get(0).equals(newTab2.get(0)) &&
                newTab1.get(newTab1.size()-1).equals(newTab2.get(newTab2.size() -1))){
            System.out.println("Są takie same!");
        }else {
            System.out.println("Nie sa takie sam!");
        }
    }
}
