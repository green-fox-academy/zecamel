public class PrintArguments {
    public static void main(String[] args) {
        String[] a = new String[] {"First","Second","Third","Fourth"};
        printers(a);
        
    }
    private static void printers(String[] x){
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
            
        }
    }
}
