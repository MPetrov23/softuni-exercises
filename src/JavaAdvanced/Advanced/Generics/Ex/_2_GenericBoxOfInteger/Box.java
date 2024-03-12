package JavaAdvanced.Advanced.Generics.Ex._2_GenericBoxOfInteger;

public class Box<T> {
    private T data;

    public Box(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.format("%s: %s",this.data.getClass().getName(), this.data);
    }
}