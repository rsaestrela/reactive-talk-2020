package me.estrela.rk.observer;

public class ObservableTest {

    public static void main(String[] args) {

        Observable observable = new Door();
        observable.addObserver(new Person("Sergio"));
        observable.addObserver(new Person("John"));
        observable.addObserver(new Person("Peter"));

        observable.event();

    }


}
