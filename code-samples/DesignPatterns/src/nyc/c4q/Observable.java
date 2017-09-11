package nyc.c4q;

import java.util.ArrayList;
import java.util.List;

public class Observable<T> {
    List<Observer<T>> listeners = new ArrayList<>();

    public void addObserver(Observer<T> listener){
        listeners.add(listener);
    }

    public void removeObserver(Observer<T> listener){
        listeners.remove(listener);
    }

    public void publish(T data){
        for (Observer<T> listener : listeners){
            listener.accept(data);
        }
    }
}
