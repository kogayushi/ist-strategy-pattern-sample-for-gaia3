package jp.co.is_tech;

import java.time.LocalDate;

public abstract class KaiseiStrategy {
    protected LocalDate baseDate;

    KaiseiStrategy(LocalDate baseDate) {
        this.baseDate = baseDate;
    }
    abstract void calculate();
    abstract void execute();
    abstract void doSomething();
}
