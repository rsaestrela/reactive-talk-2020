package me.estrela.rk.reactivestreams;

import java.util.concurrent.Flow;

public class Person implements Flow.Subscriber<Integer> {

    private final String name;
    private final int items;

    public Person(String name,
                  int items) {
        this.name = name;
        this.items = items;
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        System.out.println(name + ": I am subscribed and I'm going to request a maximum of " + items + " items");
        subscription.request(items);
    }

    @Override
    public void onNext(Integer item) {
        System.out.println(name + ": Received item " + item);
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println(name + ": Caught error " + throwable.getMessage());
    }

    @Override
    public void onComplete() {
        System.out.println(name + ": Finished receiving items ");
    }

}
