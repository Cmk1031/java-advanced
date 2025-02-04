package day02.test.exception2;

public abstract class Payment implements Payable {
    protected String shopName;
    protected String productName;
    protected Long productPrice;

    public Payment(String shopName, String productName, Long productPrice) {
        this.shopName = shopName;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public void pay() throws PayException {

    }

}
