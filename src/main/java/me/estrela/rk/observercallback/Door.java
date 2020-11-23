package me.estrela.rk.observercallback;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Door implements Observable {

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void event() {
        observers.forEach(observer -> observer.handleEvent(LocalDateTime.now()));
    }

}
