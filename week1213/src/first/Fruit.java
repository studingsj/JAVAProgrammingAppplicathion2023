package first;

public class Fruit implements Comparable<Fruit>{
    private String name;
    private int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Fruit o) {
        return this.price - o.price; //배열이 2개면 기준 만들기
    }
}
