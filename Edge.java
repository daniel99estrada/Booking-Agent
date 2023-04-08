public class Edge {
    private City city1;
    private City city2;
    private float cost;
    
    public Edge(City city1, City city2, float cost) {
        this.city1 = city1;
        this.city2 = city2;
        this.cost = cost;
    }
        
    public float getCost() {
        return cost;
    }
}
