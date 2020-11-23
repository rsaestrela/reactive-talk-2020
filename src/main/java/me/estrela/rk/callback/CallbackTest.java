package me.estrela.rk.callback;

public class CallbackTest {

    public static void main(String[] args) {

        var sum = new Operation();
        sum.onEvent(Integer::sum);

        var subtraction = new Operation();
        subtraction.onEvent((v1, v2) -> v1 - v2);

        var calculator = new Calculator();
        System.out.println(calculator.executeOperation(1, 1, sum));
        System.out.println(calculator.executeOperation(6, 3, subtraction));

    }


}
