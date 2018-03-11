package jp.co.is_tech;

import java.util.Collections;
import java.util.List;

public class CompositeKaiseiStrategy extends KaiseiStrategy {

    private final List<KaiseiStrategy> strategies;

    public CompositeKaiseiStrategy(List<KaiseiStrategy> strategies) {
        super(null);
        this.strategies = Collections.unmodifiableList(strategies);
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
