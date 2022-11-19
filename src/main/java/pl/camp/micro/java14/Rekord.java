package pl.camp.micro.java14;

public record Rekord(String name, String surname, int age) {

    public void cos() {
        System.out.println("cos");
    }
}
