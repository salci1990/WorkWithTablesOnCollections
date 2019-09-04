import java.util.Arrays;
import java.util.List;

public class Zadanie12 {

    public void zadanie12() {

//        Napisz program, który znajdzie te same elementy
//        w dwóch tablicach zawierających Stringi.
//
//        tab1  = a,b,c,d,e
//        tab2 = x,a,y,b,s,d
//        result = a,b,d
        String tab1[] = new String[]{"a","b","c","d","e"};
        String tab2[] = new String[]{"x", "a", "y","b","s","d"};
        List<String> newTab1 = Arrays.asList(tab1);
        List<String> newTab2 = Arrays.asList(tab2);
        for (String value1:newTab1) {
            for (String value2: newTab2) {
                if (value1 == value2){
                    System.out.print(value1);
                }
            }
        }
    }
}
