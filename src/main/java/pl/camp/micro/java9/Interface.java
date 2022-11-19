package pl.camp.micro.java9;

public interface Interface {

    default void metoda() {
        m1();
        m2();
        m3();
    }

    private void m1() {
        //??1
        //??2
    }

    private void m2() {
        //??3
        //??4
    }

    private void m3() {
        //??5
        //??6
    }
}
