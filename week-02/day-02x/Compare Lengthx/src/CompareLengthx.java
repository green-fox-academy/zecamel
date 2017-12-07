import java.util.*;

public class CompareLengthx {
    public static boolean main(String... args) {

        ArrayList<Integer> p1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> p2 = new ArrayList<Integer>(Arrays.asList(4, 5));
        if (p1 == null && p2 == null) {
            return true;
        }

        if ((p1 == null && p2 != null)
                || p1 != null && p2 == null
                || p1.size() != p2.size()) {
            return false;

        }
        System.out.println(true);
        Collections.sort(p1);
        Collections.sort(p2);
        return p1.equals(p2);
    }

}
