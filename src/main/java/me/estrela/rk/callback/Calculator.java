package me.estrela.rk.callback;

public class Calculator {

    public int executeOperation(int v1, int v2, Operation operation) {
        return operation.execute(v1, v2);
    }

}
