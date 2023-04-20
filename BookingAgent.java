import java.util.*;
import java.util.Scanner;

public class BookingAgent {
    public static void main(String[] args) {
        System.out.println("Welcome to the Flight Booking program!");

        Graph graph = new Graph();
        // Add edges for Miami
        Edge miamiToNewYork = new Edge(new City("Miami"), new City("New York"), 200);
        Edge miamiToAtlanta = new Edge(new City("Miami"), new City("Atlanta"), 410);
        graph.FlightsGraph.put("Miami", Map.of(
                miamiToNewYork.getCity2().getName(), (int) miamiToNewYork.getCost(),
                miamiToAtlanta.getCity2().getName(), (int) miamiToAtlanta.getCost()));

        // Add edges for New York
        Edge newYorkToAtlanta = new Edge(new City("New York"), new City("Atlanta"), 130);
        Edge newYorkToDallas = new Edge(new City("New York"), new City("Dallas"), 710);
        graph.FlightsGraph.put("New York", Map.of(
                newYorkToAtlanta.getCity2().getName(), (int) newYorkToAtlanta.getCost(),
                newYorkToDallas.getCity2().getName(), (int) newYorkToDallas.getCost()));

        // Add edges for Atlanta
        Edge atlantaToDallas = new Edge(new City("Atlanta"), new City("Dallas"), 310);
        Edge atlantaToLosAngeles = new Edge(new City("Atlanta"), new City("Los Angeles"), 590);
        graph.FlightsGraph.put("Atlanta", Map.of(
                atlantaToDallas.getCity2().getName(), (int) atlantaToDallas.getCost(),
                atlantaToLosAngeles.getCity2().getName(), (int) atlantaToLosAngeles.getCost()));

        // Add edges for Dallas
        Edge dallasToLosAngeles = new Edge(new City("Dallas"), new City("Los Angeles"), 420);
        graph.FlightsGraph.put("Dallas", Map.of(
                dallasToLosAngeles.getCity2().getName(), (int) dallasToLosAngeles.getCost()));

        Scanner scanner = new Scanner(System.in);

        boolean done = false;
        while (!done) {
            System.out.println();
            System.out.println("Please select a city of origin: Miami, New York, Dallas, Atlanta, Los Angeles, or type 'exit' to quit.");
            String origin = scanner.nextLine();
            if (origin.equalsIgnoreCase("exit")) {
                done = true;
                break;
            }

            System.out.println("Please select your destination: Miami, New York, Dallas, Atlanta, Los Angeles, or type 'exit' to quit.");
            String destination = scanner.nextLine();
            if (destination.equalsIgnoreCase("exit")) {
                done = true;
                break;
            }

            DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(graph.FlightsGraph);
            List<String> path = dijkstra.shortestPath(origin, destination);
            if (path == null) {
                System.out.println("There is no path from " + origin + " to " + destination + ".");
            } else {
                System.out.println("The shortest route from " + origin + " to " + destination + " is:");
                System.out.println(path);
            }
        }

        System.out.println("Thank you for using the Flight Booking program!");
    }
}