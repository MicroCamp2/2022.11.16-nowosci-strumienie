package pl.camp.micro.strumienie;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App2 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(9);

        System.out.println(integers);

        integers.stream()
                .filter(x -> x > 4)
                .forEach(x -> System.out.println(x));


        for(int i : integers) {
            if(i > 4) {
                System.out.println(i);
            }
        }

        //System.out.println(integers1);

        /*integers.stream()
                .map(x -> x + "abc")
                .peek(x -> x + "abc")*/
    }
}
