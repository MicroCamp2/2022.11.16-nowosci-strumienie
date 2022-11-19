package pl.camp.micro.java10;

import java.util.List;
import java.util.stream.Collectors;

public class UnmodifalbeCollections {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);

        List<Integer> integers = list.stream().toList();

        integers.add(7);

        System.out.println(integers);
    }
}
