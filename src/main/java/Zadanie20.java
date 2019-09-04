import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadanie20 {

    public void zadanie20() {

//        Napisz program, który usunie liczbę z tablicy i wszystkie
//        większe liczby znajdujące się po prawej stronie od szukanej liczby.
//
//        tab = [1,2,3,4,5,6,4,5,6,7,8,9,1,2,3]
//        szukana liczba 5
//        newTab = [1,2,3,4,4,1,2,3]

        Integer tab[] = new Integer[]{1,2,9,3,4,5,6,4,5,6,7,8,9,1,2,3};
        List<Integer> newTab = Arrays.asList(tab);
        List<Integer> newList = new ArrayList<>();
        int index = newTab.indexOf(5);

        for (int i = 0; i < newTab.size(); i++) {
            if (i < index){
            newList.add(newTab.get(i));
        }
        if (i > index && newTab.get(i) < 5){
                newList.add(newTab.get(i));
            }
        }
        newList.forEach(System.out::print);
    }
}
