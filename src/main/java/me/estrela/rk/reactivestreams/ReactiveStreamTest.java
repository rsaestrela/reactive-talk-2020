package me.estrela.rk.reactivestreams;

import java.util.Random;
import java.util.concurrent.SubmissionPublisher;

public class ReactiveStreamTest {

    public static void main(String[] args) {

        final SubmissionPublisher<Integer> doorbell = new SubmissionPublisher<>();
        doorbell.subscribe(new Person("Sergio", 1));
        doorbell.subscribe(new Person("Raul", 2));
        doorbell.subscribe(new Person("TiuMan", 3));

        doorbell.submit(new Random().nextInt());
        doorbell.submit(new Random().nextInt());
        doorbell.submit(new Random().nextInt());
        doorbell.submit(new Random().nextInt());
        doorbell.submit(new Random().nextInt());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        doorbell.close();

    }

}
