package day01.test.polymorphism2.beverage;

public abstract class Beverage {
    private String name;
    private int price;

    public Beverage(String name) {
        this.name = name;
    }

    abstract void calcPrice();

    public void print() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
