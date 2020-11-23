package me.estrela.rk.callback;

import java.util.function.BiFunction;

public class Operation {

    private BiFunction<Integer, Integer, Integer> fn;

    public <T> void onEvent(BiFunction<Integer, Integer, Integer> fn) {
        this.fn = fn;
    }

    public int execute(int v1, int v2) {
        return fn.apply(v1, v2);
    }

}
