import java.util.*;

public class IsInList{
    public static void main(String... args){
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));

        // Check if list contains all of the following elements: 4,8,12,16
        // Print "true" if it contains all, otherwise print "false"
        // Can you do both the different approaches you tried in the previous one?

        if (list1.contains(4) && list1.contains(8) && list1.contains(12) && list1.contains(16)){
            boolean ikr = true;
            System.out.println("True");
        }
        else {
            boolean ikn = false;
            System.out.println("False");
        }
    }
}