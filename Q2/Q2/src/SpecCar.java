
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
        String addXZ = "XZ" + super.getMaker();  
        int addPrice = super.getPrice() + 20;
        
        System.out.println(addXZ + ", " + addPrice);
    }
    
    public int getValue() {
        int inc= 0;
        if (this.type <= 7) {
            inc = 10;
            return super.getPrice() + inc;
        } else {
            inc = 15;
            return super.getPrice() + inc;
        }
    }
     
}
