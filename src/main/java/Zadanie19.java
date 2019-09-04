import java.util.*;

public class Zadanie19 {

    public void zadanie19() {

//        Napisz program, który policzy który policzy, jakich liczb jest najwięcej.
//                tab = [1, 1, 3, 2, 2, 7, 4, 5, 7, 5, 7]
//        odpowiedź - najwięcej jest 7 - 3x

        Integer tab[] = new Integer[]{1, 1, 3, 2, 2, 7, 4, 5, 7, 5, 7};
        List<Integer> newTab = Arrays.asList(tab);
        Map<Integer, Integer> resoult = new HashMap<>();

        for (int value : newTab) {
            if (!resoult.keySet().contains(value)) {
                resoult.put(value, 1);
            } else {
                if (resoult.containsValue(value)) ;
                int counter = resoult.get(value);
                resoult.put(value, counter + 1);
            }
        }
        Integer max = resoult
                .values()
                .stream()
                .mapToInt(v -> v)
                .max().orElseThrow(NoSuchElementException::new);

        System.out.println(max);
    }
}
