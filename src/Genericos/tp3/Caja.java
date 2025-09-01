package Genericos.tp3;

public class Caja<T> {
    public T generico;

    public Caja(T generico) {
        this.generico = generico;
    }

    public T getGenerico() {
        return generico;
    }

    public void setGenerico(T generico) {
        this.generico = generico;
    }

    @Override
    public String toString() {
        return "Caja{" +
                "generico=" + generico +
                '}';
    }
}
