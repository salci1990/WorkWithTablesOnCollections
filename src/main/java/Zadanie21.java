import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadanie21 {

    public void zadanie21() {

//        Napisz program, który przesunie wszystkie 0 na lewą
//        stronę a wszystkie 1 na prawą stronę.
//
//        tab = [0,1,0,0,1,1,1,0,0,1,1]
//        newTab = [0,0,0,0,0,1,1,1,1,1,1]

        Integer tab[] = new Integer[]{0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1};
        List<Integer> newTab = Arrays.asList(tab);
        List<Integer> newList = new ArrayList<>();

        for (int value : newTab) {
            if (value == 0) {
                newList.add(value);
            }
        }
        for (int value : newTab) {
            if (value == 1) {
                newList.add(value);
            }
        }
        System.out.println(newList);
    }
}
