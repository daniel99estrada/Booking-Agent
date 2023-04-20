import java.util.*;

public class DijkstraAlgorithm {
    
    private final Map<String, Map<String, Integer>> graph;
    
    public DijkstraAlgorithm(Map<String, Map<String, Integer>> graph) {
        this.graph = graph;
    }
    
    public List<String> shortestPath(String start, String end) {
        final Map<String, Integer> distances = new HashMap<>();
        final Map<String, String> parents = new HashMap<>();
        final Set<String> visited = new HashSet<>();
        PriorityQueue<String> pq = new PriorityQueue<>(Comparator.comparingInt(distances::get));
        
        // Set start node to distance 0 and add to priority queue
        distances.put(start, 0);
        pq.add(start);
        
        while (!pq.isEmpty()) {
            String current = pq.poll();
            
            if (current.equals(end)) {
                // We found the shortest path, reconstruct it and return
                List<String> path = new ArrayList<>();
                while (!current.equals(start)) {
                    path.add(current);
                    current = parents.get(current);
                }
                path.add(start);
                Collections.reverse(path);
                return path;
            }
            
            visited.add(current);
            
            for (Map.Entry<String, Integer> neighbor : graph.get(current).entrySet()) {
                String neighborName = neighbor.getKey();
                int distanceToNeighbor = neighbor.getValue();
                
                if (!visited.contains(neighborName)) {
                    int tentativeDistance = distances.get(current) + distanceToNeighbor;
                    if (tentativeDistance < distances.getOrDefault(neighborName, Integer.MAX_VALUE)) {
                        // We've found a shorter path to the neighbor
                        distances.put(neighborName, tentativeDistance);
                        parents.put(neighborName, current);
                        pq.add(neighborName);
                    }
                }
            }
        }
        
        return new ArrayList<>();
    }
    
    public static void main(String[] args) {
 
    }
}
