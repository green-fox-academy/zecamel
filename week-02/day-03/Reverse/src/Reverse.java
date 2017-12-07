public class Reverse {
    public static void main(String... args){

        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        char[] charArray = reversed.toCharArray();
        for (int i = charArray.length-1; i>=0 ; i--) {
            System.out.print(charArray[i]);
        }

    }
}


