package lesson2OOP.HomeWork.dataBase;

public class GoodsChar {

    private String NameGoods;
    private String madeIn;
    private int value;
    private int price;

    public GoodsChar() {
    }

    public GoodsChar(String nameGoods, String madeIn, int value, int price) {
        NameGoods = nameGoods;
        this.madeIn = madeIn;
        this.value = value;
        this.price = price;
    }

    public String getNameGoods() {
        return NameGoods;
    }

    public void setNameGoods(String nameGoods) {
        NameGoods = nameGoods;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name of goods: " + getNameGoods() + "\n"
                + "Made in: " + getMadeIn() + "\n"
                + "Price: " + getPrice() + "\n"
                + "Value: " + getValue();
    }
}
