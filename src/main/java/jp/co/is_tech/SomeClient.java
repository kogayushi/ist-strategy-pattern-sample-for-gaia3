package jp.co.is_tech;

import java.time.LocalDate;

public class SomeClient {

    public static void main(String... args) {
        KaiseiStrategy kaiseiStrategy = StrategyFactory.create(LocalDate.of(2018 ,4,1));
        kaiseiStrategy.calculate();
    }

}
