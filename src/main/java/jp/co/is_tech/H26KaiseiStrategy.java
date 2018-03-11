package jp.co.is_tech;

import java.time.LocalDate;

public class H26KaiseiStrategy extends KaiseiStrategy {

    public H26KaiseiStrategy(LocalDate baseDate) {
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
