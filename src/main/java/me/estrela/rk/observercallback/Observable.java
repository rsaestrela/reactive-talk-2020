package me.estrela.rk.observercallback;

public interface Observable {

    void addObserver(Observer observer);

    void event();

}
