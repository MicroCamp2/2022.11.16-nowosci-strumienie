package pl.camp.micro.java9;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class MetodyFabrykujace {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7);

        Set<String> asdf = Set.of("asdf", "ASdf", "sdfassdf");

        Map<Integer, String> integerStringMap = Map.of(
                1, "v1",
                2, "v2",
                3, "v3");

        Map<Integer, String> integerStringMap1 = Map.ofEntries(
                Map.entry(1, "v1"),
                Map.entry(2, "v2"),
                Map.entry(3, "v3"));

        //integers.add(5);
    }
}
