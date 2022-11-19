package pl.camp.micro.java12;

public class Switch {
    public static void main(String[] args) {
        int i = 2;
        String liczba;

        switch(i) {
            case 1:
                liczba = "one";
                break;
            case 2:
                liczba = "two";
                break;
            case 3, 4:
                liczba = "three or four";
                break;
            default:
                liczba = "other";
                break;
        }

        System.out.println(liczba);

        int i2 = 2;
        String liczba2 = switch(i) {
            case 1 -> "one";
            case 2 -> "two";
            case 3, 4 -> "three or four";
            default -> "other";
        };

        String cos = i > 2 ? "tak" : "nie";

        switch(i) {
            case 1 -> System.out.println(i + " jeden");
            case 2 -> System.out.println(i + " dwa");
            default -> System.out.println("nie wiadomo");
        }
    }
}
