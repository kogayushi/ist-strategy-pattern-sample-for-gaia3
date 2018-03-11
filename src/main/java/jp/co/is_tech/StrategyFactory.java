package jp.co.is_tech;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StrategyFactory {

    public static KaiseiStrategy create(final LocalDate targetDate) {
        List<KaiseiStrategy> strategies = new ArrayList<>();

        strategies.add(new H24KaiseiStrategy(LocalDate.of(2012,4,1)));
        strategies.add(new H26KaiseiStrategy(LocalDate.of(2014,4,1)));
        strategies.add(new H28KaiseiStrategy(LocalDate.of(2016,4,1)));
        strategies.add(new H30KaiseiStrategy(LocalDate.of(2018,4,1)));

        return new CompositeKaiseiStrategy(strategies.stream()
                         .filter(strategy -> targetDate.isAfter(strategy.baseDate) || targetDate.equals(strategy.baseDate))
                         .collect(Collectors.toList()));
    }
}
