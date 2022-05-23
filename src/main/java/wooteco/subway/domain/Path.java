package wooteco.subway.domain;

import java.util.List;
import java.util.stream.Collectors;

import org.jgrapht.GraphPath;
import org.jgrapht.graph.DefaultWeightedEdge;

public class Path {

    public static final int BASIC_FARE = 1250;
    private final GraphPath<Station, SectionEdge> graphPath;

    public Path(GraphPath<Station, SectionEdge> graphPath) {
        this.graphPath = graphPath;
    }

    public List<Station> findStationsOnPath() {
        return graphPath.getVertexList();
    }

    public List<Line> findLineOnPath() {
        return graphPath.getEdgeList()
                .stream()
                .map(SectionEdge::getLine)
                .collect(Collectors.toList());
    }

    public int calculateShortestDistance() {
        return (int) graphPath.getWeight();
    }
}
