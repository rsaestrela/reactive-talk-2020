package me.estrela.rk.observercallback;

public class ObservableTest {

    public static void main(String[] args) {

        var observer1 = new Person("Sergio");
        observer1.onEvent(localDateTime -> System.out.println("Received event at " + localDateTime));

        var observer2 = new Person("Sergio");
        observer2.onEvent(localDateTime -> System.out.println("Received event at " + localDateTime));

        var observer3 = new Person("Sergio");
        observer3.onEvent(localDateTime -> System.out.println("Received event at " + localDateTime));

        var observable = new Door();
        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.addObserver(observer3);

        observable.event();

    }


}
