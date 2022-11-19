package pl.camp.micro.strumienie;

import java.util.ArrayList;
import java.util.List;

public class App3 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "3", 300.00));
        cars.add(new Car("Audi", "A5", 400.00));
        cars.add(new Car("Toyota", "Corolla", 200.00));
        cars.add(new Car("Skoda", "Fabia", 150.00));

        cars.stream().parallel()
                .filter(car -> car.getPrice() > 200.0)
                .peek(car -> car.setPrice(200.0))
                .map(Car::getBrand)
                .peek(System.out::println)
                .forEach(System.out::println);

        for(Car c : cars) {
            if(c.getPrice() > 200.0) {
                c.setPrice(200.0);
            }
        }

        long t1 = System.currentTimeMillis();

        //??
        //??

        long t2 = System.currentTimeMillis();

        System.out.println(t2-t1);

        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);
        ints.add(6);

        int sum = ints.stream().reduce(0, (acc, element) -> acc + element);
        System.out.println(sum);

        List<String> strings = new ArrayList<>();
        strings.add("jkashgdf");
        strings.add("fdg");
        strings.add("sdfg");
        strings.add("asdgasdgasdg");
        strings.add("dsfg");

        int stringSum = strings.stream()
                .map(String::length)
                .reduce(0, Integer::sum);

        System.out.println(stringSum);
    }
}
