package jp.co.is_tech;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class CompositeKaiseiStrategy implements KaiseiStrategy {

    private final List<KaiseiStrategy> strategies;

    public CompositeKaiseiStrategy(List<KaiseiStrategy> strategies) {
        this.strategies = Collections.unmodifiableList(strategies);
    }

    @Override
    public LocalDate getBaseDate() {
        throw new UnsupportedOperationException("cannot call this method");
    }

    @Override
    public void calculate() {
        strategies.stream().forEach( i -> i.calculate());
    }

    @Override
    public void execute() {
        strategies.stream().forEach( i -> i.execute());

    }

    @Override
    public void doSomething() {
        strategies.stream().forEach( i -> i.doSomething());
    }
}
