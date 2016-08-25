package nyc.c4q.ac21.ac20150322;

import java.net.URL;
import java.util.Scanner;

/**
 * Created by samuel on 2015-03-22.
 */
public class HttpTest {

    public static final String
            URL = "http://alexsamuel.net/AliceInWonderland.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        URL url = HTTP.stringToURL(input);
        String document = HTTP.get(url);

        System.out.println(document);
    }

}
