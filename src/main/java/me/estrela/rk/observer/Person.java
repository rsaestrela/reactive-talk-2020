package me.estrela.rk.observer;

public class Person implements Observer {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent() {
        System.out.println(name + " received an event");
    }

}
