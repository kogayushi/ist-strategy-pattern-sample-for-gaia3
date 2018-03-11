package jp.co.is_tech;

import java.time.LocalDate;

public class H24KaiseiStrategy extends KaiseiStrategy {

    public H24KaiseiStrategy(LocalDate baseDate) {
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
