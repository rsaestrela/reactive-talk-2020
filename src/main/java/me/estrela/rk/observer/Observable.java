package me.estrela.rk.observer;

public interface Observable {

    void addObserver(Observer observer);

    void event();

}
