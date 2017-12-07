import java.util.*;

public class QuoteSwap{
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What" , "I", "do", "create,", "I", "cannot", "not", "understand."));

        ArrayList<String> quote = new ArrayList<String>(list);
        quote.set(2, list.get(5));
        quote.set(5, list.get(2));

        System.out.println(quote);
    }
}