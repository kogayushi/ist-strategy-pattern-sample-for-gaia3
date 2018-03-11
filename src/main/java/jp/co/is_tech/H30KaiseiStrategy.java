package jp.co.is_tech;

import java.time.LocalDate;

public class H30KaiseiStrategy extends KaiseiStrategy {

    public H30KaiseiStrategy(LocalDate baseDate) {
        super(baseDate);
    }

    @Override
    public void calculate() {
        System.out.println(baseDate);
    }

    @Override
    public void execute() {

    }

    @Override
    public void doSomething() {

    }
}
