package jp.co.is_tech;

import java.time.LocalDate;

public interface KaiseiStrategy {
    LocalDate getBaseDate();
    void calculate();
    void execute();
    void doSomething();
}
