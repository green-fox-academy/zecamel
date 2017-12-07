public class UserFixer {
    public static void main(String... args) {

        String url = "https//www.reddit.com/r/nevertellmethebots";

        String url1 = url.replace("https//","https://");

        System.out.println(url1.replace("bots", "odds"));

    }
}
