//import java.util.ArrayList;
//import java.util.LinkedList;

class Graph {
    private int[][] graphMatrix;
    private int vertices;
    
    //Creates a baseline graph as a square. No connections are made
    public Graph(int vertices) {
        this.graphMatrix = new int[vertices][vertices];
        for(int i = 0; i < vertices; i++) {
            for(int j = 0; j < vertices; j++) {
                graphMatrix[i][j] = 0;
            }
        }
    }

    //Allows an edge to be added, replaces any existing weight value
    public void addEdge(int source, int dest, int weight) {
        this.graphMatrix[source][dest] = weight;
    }

    //"Removes" an edge by setting its weight to zero
    public void removeEdge(int source, int dest) {
        this.graphMatrix[source][dest] = 0;
    }

    //Returns the weight value between a source and destination. 0 means no connection
    public int getWeight(int source, int dest) {
        return this.graphMatrix[source][dest];
    }

    //Returns whether a directed connection (weight>0) exists between two points
    public boolean isConnected(int source, int dest) {
        return (this.graphMatrix[source][dest] != 0);
    }

    //Attempt to implement the exsitingConnections method that returns an array of linked lists
    /*public int[][] existingConnections() {
        ArrayList<LinkedList> connections = new ArrayList<>(15);
        for(int i = 0; i < this.vertices; i++) {
            for(int j = 0; j < vertices; j++) {
                if(this.graphMatrix[i][j] != 0)
                connections.add(i, j);
            }
        }
    }*/
    
    //Prints out all existing connections
    public void existingConnections() {
        for(int i = 0; i < this.vertices; i++) {
            for(int j = 0; j < this.vertices; j++) {
                if(this.graphMatrix[i][j] > 0)
                System.out.println(i + " is connected to " + j);
            }
        }
    }
}