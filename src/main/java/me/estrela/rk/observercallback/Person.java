package me.estrela.rk.observercallback;

import java.time.LocalDateTime;
import java.util.function.Consumer;

public class Person implements Observer {

    private final String name;
    private Consumer<LocalDateTime> fn;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void onEvent(Consumer<LocalDateTime> fn) {
        this.fn = fn;
    }

    @Override
    public void handleEvent(LocalDateTime dateTime) {
        if (fn == null) {
            throw new IllegalStateException("don't know what to do!!!");
        }
        fn.accept(dateTime);
    }

}
