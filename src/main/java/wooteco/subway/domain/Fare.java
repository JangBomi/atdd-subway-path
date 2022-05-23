package wooteco.subway.domain;

import java.util.List;
import java.util.Optional;

public class Fare {

    private static final int DEFAULT_EXTRA_FARE = 0;

    public static int chargeFare(Path path) {
        double distance = path.calculateShortestDistance();
        int fare = 0;
        Optional<FarePolicy> fareStandard = Optional.of(FarePolicy.DEFAULT);

        while (fareStandard.isPresent()) {
            FarePolicy presentStandard = fareStandard.get();
            fare += presentStandard.calculate(distance);
            fareStandard = presentStandard.update();
        }
        return fare + findExtraLineFare(path);
    }

    private static int findExtraLineFare(Path path) {
        List<Line> lines = path.findLineOnPath();

        return lines.stream()
                .mapToInt(Line::getExtraFare)
                .max()
                .orElse(DEFAULT_EXTRA_FARE);
    }
}
