// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

public class Strings {
    public static void main(String[] args) {

        String str1 = "xouxxx";
        System.out.println(replacexy( str1 ));



    }
    public static String replacexy(String str2){
        if (str2.length() == 0) {
            return "";
        } else if (str2.charAt( 0 ) == 'x') {
            return 'y' + replacexy( str2.substring( 1 ) );
        } else {
            return str2.charAt(0)+replacexy( str2.substring( 1 ) );
        }

    }
}
