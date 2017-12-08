public class Bunnies2 {
    public static void main(String[] args) {

        int bunnies = 8;
        System.out.println( ears( bunnies ) );
    }

    public static int ears(int x) {
        if (x == 0) {
            return 0;
        } else if (x % 2 != 0) {
            return ears( x - 1 ) + 2;
        } else {
            return ears( x - 1 ) + 3;
        }
    }
}


//        if ( b == 0) {
//            return 0;
//        }else{
//              return ears((b-1)+((((b-1)/2+1)+((b-(b/2*3)))*2)));
//           // return ears (((b-b%2)/2)*3)+(b-((b-b%2)/2)*2);
//        }
//    }
//}
