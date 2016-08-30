
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String hello = "Hello";
        printHashtags("@c4q #rocks #code #tech stuff goes here");
//        System.out.println(hello.charAt(7));
//        twitterMentions("@c4q #rocks #code #tech stuff goes here");
        twitterMentionsArray("@c4q #rocks #code #tech stuff goes here");
    }

    public static void drawTriangle (int size) {
        String triangleString = "";
        for (int i = 0; i < size; i++) {
            triangleString += "#";
            System.out.println(triangleString);
        }
    }

    public static void drawTriangleWithWhile(int size){
        String triangleString = "";
        int i = 0;
        while(i < size) {
            triangleString = triangleString + "#";
            System.out.println(triangleString);
            i++;
        }
    }

    public static void printHashtags(String tweet){
        Scanner scanner = new Scanner(tweet);
        while(scanner.hasNext()){
            String word = scanner.next();
            if(word.charAt(0) == '@' || word.charAt(0) =='#'){
                System.out.println(word);
            }

        }

    }



    public static void twitterMentionsArray(String tweet){
        String[] words = tweet.split(" ");
        String mentions = "Mentions: ";
        String hashtags = "Hashtags:";
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            if(word.charAt(0) == '#'){
                hashtags += word + " ";
            }else if(word.charAt(0) == '@'){
                mentions += word + " ";
            } else{
                continue; //do nothing;
            }
        }
        System.out.println(mentions);
        System.out.println(hashtags);
    }

    public static void twitterMentions(String tweet){
       String mentions = "";
        String hashtags = "";

        for(int i = 0; i < tweet.length(); i++){
            char c = tweet.charAt(i);
            switch (c){
                case '@':
                    while(tweet.charAt(i) != ' ' && i < tweet.length()) {
                        mentions += tweet.charAt(i);
                        i++;
                    }
                    break;
                case '#':
                    while(c != ' ' && i < tweet.length()){
                        hashtags += tweet.charAt(i);
                        i++;
                        if(tweet.charAt(i) == ' '){
                            break;
                        }
                    }
                    break;
                default: continue;
                    //fixme any letter thats not @ or #
            }
        }
        System.out.println(mentions);
        System.out.println(hashtags);
    }
}

