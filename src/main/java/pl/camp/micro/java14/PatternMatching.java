package pl.camp.micro.java14;

public class PatternMatching {
    public static void main(String[] args) {
        Object o = "ABC";
        if(o instanceof String) {
            String s = (String) o;
            System.out.println(s.toLowerCase());
        }

        if(o instanceof String s) {
            System.out.println(s.toLowerCase());
        }
    }
}
