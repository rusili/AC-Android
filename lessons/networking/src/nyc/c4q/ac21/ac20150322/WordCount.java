package nyc.c4q.ac21.ac20150322;

import java.net.URL;

/**
 * Created by samuel on 2015-03-22.
 */
public class WordCount {

    public static int countWords(String text, String word) {
        text = text.toLowerCase();
        word = word.toLowerCase();

        int count = 0;
        for (int i = text.indexOf(word);
             i != -1;
             i = text.indexOf(word, i + word.length()))
            count++;
        return count;
    }

    public static void main(String[] args) {
        URL url = HTTP.stringToURL("http://alexsamuel.net/AliceInWonderland.txt");
        String document = HTTP.get(url);
        System.out.println(countWords(document, "Alice"));
    }

}
