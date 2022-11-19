package pl.camp.micro.java11;

import java.util.List;

public class MetodyDlaKlasyString {
    public static void main(String[] args) {
        String s1 = " ";

        System.out.println(s1.isBlank());
        System.out.println(s1.isEmpty());

        String s2 = " ABC ";
        System.out.println(s2.strip());
        System.out.println(s2.stripLeading());
        System.out.println(s2.stripTrailing());

        String s3 = "abc";
        System.out.println(s3.repeat(5));

        String lines = "A\nB\nC";
        System.out.println(lines);

        List<String> strings = lines.lines().toList();
        System.out.println(strings);
    }
}
