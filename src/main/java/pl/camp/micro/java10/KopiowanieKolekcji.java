package pl.camp.micro.java10;

import java.util.List;
import java.util.stream.Collectors;

public class KopiowanieKolekcji {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3,4,5,6);
        System.out.println(integers);
        //List<Integer> integers2 = List.copyOf(integers);
        List<Integer> integers2 = integers.stream().collect(Collectors.toList());
        integers2.add(7);

    }
}
