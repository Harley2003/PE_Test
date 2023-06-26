
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.List;

public class MyCar implements ICar {

    @Override
    public int f1(List<Car> t) {
        int sum  = 0;
        for (Car car : t) {
            sum += car.getRate();
        }
        return sum / t.size();
    }

    @Override
    public void f2(List<Car> t) {
        int maxIndex = 0, minIndex = 0;
        int maxRate = Integer.MAX_VALUE;
        int minRate = Integer.MIN_VALUE;
        for (int i = 0; i < t.size(); i++) {
            if(t.get(i).getRate() > t.get(maxIndex).getRate()) {
                maxIndex = i;
            }
            if(t.get(i).getRate() < t.get(minIndex).getRate()) {
                minIndex = i;
            }
        }
        Collections.swap( t, maxIndex, minIndex);
    }


    @Override
    public void f3(List<Car> t) {  
        Comparator<Car> comparator = new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                if (car1.getMaker().equals(car2.getMaker())) {
                    return car2.getRate() - car1.getRate();
                } else {
                    return car1.getMaker().compareTo(car2.getMaker());
                }
            }
        };
        Collections.sort(t, comparator);
    }
}
