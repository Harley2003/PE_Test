
public class SpecCar extends Car {

    private int type;

    public SpecCar() {
    }

    public SpecCar(String maker, int price, int type) {
        super(maker, price);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + type;
    }

    public void setData() {
        setMaker("XZ" + getMaker());
        setPrice(getPrice() + 20);
    }

    public int getValue() {
        int inc;
        if (this.type < 7) {
            inc = 10;
        } else {
            inc = 15;
        }
        return super.getPrice() + inc;
    }
}
