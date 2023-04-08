import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private List<Edge> edges;
    
    public City(String name) {
        this.name = name;
        edges = new ArrayList<>();
    }
    
    // Getter and setter for name attribute
    public String getName() {
        return name;
    }
    
    // Method to add an Edge to the list
    public void addEdge(City destination, float cost) {
        Edge edge = new Edge(this, destination, cost);
        edges.add(edge);
    }
}
