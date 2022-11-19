package pl.camp.micro.strumienie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class App {
    public static void main(String[] args) {
        /*List<String> strings = new ArrayList<>();

        strings.add("Mateusz");
        strings.add("Janusz");
        strings.add("Arek");
        strings.add("Czarek");

        System.out.println(strings);

        Collections.sort(strings);

        System.out.println(strings);*/

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW", "3", 300.00));
        cars.add(new Car("Audi", "A5", 400.00));
        cars.add(new Car("Toyota", "Corolla", 200.00));
        cars.add(new Car("Skoda", "Fabia", 150.00));

        System.out.println(cars);

        Collections.sort(cars,
                (c1, c2) -> (int) (c1.getPrice() - c2.getPrice()));

        System.out.println(cars);

        Collections.sort(cars, new Comparator<>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getBrand().compareTo(o2.getBrand());
            }
        });

        System.out.println(cars);

        //int a = cos();

        Function<Integer, String> function = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return integer + " - mam taka liczbe !!!";
            }
        };

        Function<Integer, String> functionLambda = x -> x + " - mam taka liczbe !!!";

        System.out.println(function.apply(10));
        System.out.println(function.apply(43));
        System.out.println(function.apply(234));

        String x = cos(function, 345);
        System.out.println(x);

        BiFunction<Integer, Integer, String> biFunction =
                new BiFunction<Integer, Integer, String>() {
            @Override
            public String apply(Integer integer, Integer integer2) {
                return integer + integer2 + "";
            }
        };

        BiFunction<Integer, Integer, String> biFunctionLambda = (a, b) -> a + b + "";

        String s = biFunction.apply(4, 7);
        System.out.println(s);
        biFunctionLambda.apply(3,4);

        UnaryOperator<Double> unaryOperator = new UnaryOperator<Double>() {
            @Override
            public Double apply(Double aDouble) {
                return aDouble * 4;
            }
        };

        UnaryOperator<Double> unaryOperatorLambda = a -> a*4;

        double d = unaryOperator.apply(3.3);
        System.out.println(d);

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("a");
            }
        };

        System.out.println(predicate.test("abc"));
        System.out.println(predicate.test("dfgh"));

        Predicate<String> predicateLambda = string -> string.contains("a");

        Supplier<Car> supplier = new Supplier<Car>() {
            @Override
            public Car get() {
                return new Car("default", "default", 0.0);
            }
        };

        System.out.println(supplier.get());

        Supplier<Car> supplierLambda = () -> new Car("default", "default", 0.0);

        System.out.println(supplier.get());

        Consumer<Car> consumer = new Consumer<Car>() {
            @Override
            public void accept(Car car) {
                System.out.println(car);
            }
        };

        consumer.accept(new Car("Audi", "A3", 100.00));
        consumer.accept(supplier.get());

        Consumer<Car> consumerLambda = c -> System.out.println(c);
        consumerLambda.accept(supplierLambda.get());

        Consumer<Car> carConsumer = c -> {
            System.out.println(c.getBrand());
            System.out.println(c.getModel());
            System.out.println(c.getPrice());
        };

        Function<int[], Integer> suma = tab -> {
            int sum = 0;
            for(int element : tab) {
                sum += element;
            }
            return sum;
        };

        int[] t = {1,2,3,4,5};
        int sum = suma.apply(t);
        System.out.println(sum);
    }

    public static String cos(Function<Integer, String> f, int a) {
        return f.apply(a);
    }
}
