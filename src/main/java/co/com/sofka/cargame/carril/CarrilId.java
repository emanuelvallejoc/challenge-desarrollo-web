package co.com.sofka.cargame.carril;

import co.com.sofka.domain.generic.Identity;

public class CarrilId extends Identity {
    public CarrilId(String carrilId) {
        super(carrilId);
    }

    public static CarrilId of(String carrilId) {
        return new CarrilId(carrilId);
    }
}
