package jp.co.is_tech;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@RequiredArgsConstructor
public class H28KaiseiStrategy implements KaiseiStrategy {

    @Getter
    private final LocalDate baseDate;

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
