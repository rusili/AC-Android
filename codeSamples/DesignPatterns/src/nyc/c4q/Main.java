package nyc.c4q;

public class Main {

    private static Observer<String> mObser1;

    public static void main(String[] args) {
        Observable<String> stringPublisher = new Observable<>();
        mObser1 = new Observer<String>() {
            @Override
            public void accept(String data) {
                System.out.println("Publisher1 Saw " + data);
            }
        };
        stringPublisher.addObserver(mObser1);
        stringPublisher.addObserver(data -> System.out.println("Publisher2 Saw " + data));
        stringPublisher.publish("hello");
        stringPublisher.removeObserver(mObser1);
        stringPublisher.publish("goodbye");
    }
}
