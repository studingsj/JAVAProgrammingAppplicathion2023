package generic;

public class PostBox<T> { //generic class
    private T item; //타입에따라 추가되는게 용의

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
