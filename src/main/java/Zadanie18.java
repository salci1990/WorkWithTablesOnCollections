import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadanie18 {

    public void zadanie18() {

//        Napisz program, który policzy maksymalny ciąg liczb, które występują po sobie.
//                tab = [49, 1, 3, 200, 2, 4, 70, 5]
//        maksymalny ciąg to 1,2,3,4,5

        Integer tab[] = new Integer[]{1, 2, 3, 4, 5, 6, 12, 10, 8, 15, 10};
        List<Integer> newTab = Arrays.asList(tab);
        List<Integer> convertTab = new ArrayList<>();

        for (int value1 : newTab) {
            for (int value2 : newTab) {
                if (value1 + 1  == value2) {
                    convertTab.add(value1);
                }
            }
        }
        System.out.println(convertTab.size());

    }
}
