package nyc.c4q.ac21.ac20150322;

public class ASCII {

    public static void main(String args[]) {
        String greeting = "Hello, world!";

        for (int i = 0; i < greeting.length(); ++i) {
            char c = greeting.charAt(i);
            int code = (int) c;
            System.out.println("char " + c + " = " + code);
        }
    }

    public static void casts() {

        double pi = 3.14159;
        int mostOfPi = (int) pi;

        int x = 42;
        double y = x;

    }
}
