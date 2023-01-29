package Punto1;

import java.util.Comparator;

public class ComparatorInverso<T> implements Comparator<T>{
    private Comparator<T> C1;

    public ComparatorInverso(Comparator<T> C1){
        this.C1 = C1;
    }
    @Override
    public int compare(T o1, T o2) {
        return -C1.compare(o1, o2);
    }
    
}