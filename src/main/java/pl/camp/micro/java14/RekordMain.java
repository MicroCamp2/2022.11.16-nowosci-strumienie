package pl.camp.micro.java14;

public class RekordMain {
    public static void main(String[] args) {
        Rekord rekord = new Rekord("Jan", "Kowalski", 55);
        System.out.println(rekord.name());
        System.out.println(rekord.age());
        System.out.println(rekord.surname());

        rekord.cos();
    }
}
