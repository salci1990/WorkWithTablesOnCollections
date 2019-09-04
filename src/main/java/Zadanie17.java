import java.util.Arrays;
import java.util.List;

public class Zadanie17 {

    public void zadanie17(int n1, int n2) {

//        Napisz program, który sprawdzi czy tablica liczb
//        całkowitych zawiera dwa elementy np 65 i 77.

        Integer tab[] = new Integer[]{1, 2, 3, 4, 5, 12, 3, 22, 85, 67, 98, 76, 53, 77};
        List<Integer> newTab = Arrays.asList(tab);
        boolean m1 = false;
        boolean m2 = false;
        for (int value : newTab) {
            if (n1 == value) {
                m1 = true;
            }
            if (n2 == value) {
                m2 = true;
            }
        }
        if (m1 && m2) {
            System.out.println("Zawiera.");
        }
    }
}

