package nyc.c4q;

public interface Observer<T> {
    void accept(T data);
}
