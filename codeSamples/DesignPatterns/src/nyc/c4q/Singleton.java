package nyc.c4q;

public class Singleton {
    private static Singleton sInstance;

    public static Singleton getInstance(){
        if (sInstance == null){
            sInstance = new Singleton();
        }
        return sInstance;
    }
    private Singleton(){

    }
}
