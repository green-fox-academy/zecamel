public class Bunnies2 {
    public static void main(String[] args) {

        int bunnies = 8;
        System.out.println(ears(bunnies));
    }
    public static int ears(int b){
        if ( b == 0) {
            return 0;
        }else{
            return ears((b-1)+((((b-1)/2+1)+((b-(b/2*3)))*2)));
        }
    }
}
