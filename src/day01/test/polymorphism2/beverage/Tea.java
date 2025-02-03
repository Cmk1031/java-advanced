package day01.test.polymorphism2.beverage;

public class Tea extends Beverage {
    public static int amount;

    public Tea(String name) {
        super(name);
        amount++;
        calcPrice();
    }

    @Override
    void calcPrice() {
        if(super.getName().equals("lemonTea"))
            super.setPrice(1500);
        else if(super.getName().equals("ginsengTea"))
            super.setPrice(2000);
        else if(super.getName().equals("redginsengTea"))
            super.setPrice(2500);
    }
}
