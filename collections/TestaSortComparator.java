import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;


public class TestaSortComparator {
    public static void main(String[] args){
        String s[] = {"João", "Maria", "Milenarys", "Ralel"};
        List<String> l = Arrays.asList(s);
        Collections.sort(l, new NovoMetodoComparador());
        System.out.println(l);
    }
}

class NovoMetodoComparador implements Comparator {
    public int compare(Object o1, Object o2) {
        return (((String)o2).length() - ((String)o1).length());
    }
}