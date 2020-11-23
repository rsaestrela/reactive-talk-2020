package me.estrela.rk.observercallback;

import java.time.LocalDateTime;
import java.util.function.Consumer;

public interface Observer {

    void onEvent(Consumer<LocalDateTime> fn);

    void handleEvent(LocalDateTime localDateTime);

}
