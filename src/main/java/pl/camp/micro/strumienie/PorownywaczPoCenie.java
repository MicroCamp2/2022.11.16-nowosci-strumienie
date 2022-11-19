package pl.camp.micro.strumienie;

import java.util.Comparator;

public class PorownywaczPoCenie implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }
}
