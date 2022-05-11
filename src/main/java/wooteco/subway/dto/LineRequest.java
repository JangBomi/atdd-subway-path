package wooteco.subway.dto;

import javax.validation.constraints.NotBlank;

public class LineRequest {

    @NotBlank
    private String name;
    @NotBlank
    private String color;
    @NotBlank
    private Long upStationId;
    @NotBlank
    private Long downStationId;
    @NotBlank
    private int distance;

    public LineRequest() {
    }

    public LineRequest(String name, String color, Long upStationId, Long downStationId, int distance) {
        this.name = name;
        this.color = color;
        this.upStationId = upStationId;
        this.downStationId = downStationId;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Long getUpStationId() {
        return upStationId;
    }

    public Long getDownStationId() {
        return downStationId;
    }

    public int getDistance() {
        return distance;
    }
}
