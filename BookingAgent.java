import java.util.Scanner;

public class BookingAgent {
    
    public static void main(String[] args) {
        System.out.println("Welcome to the Booking Agent program!");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter your city of origin:");
        String origin = scanner.nextLine();
        
        System.out.println("Please enter your city destination:");
        String destination = scanner.nextLine();
        
        Graph graph = new Graph();
        double cheapestFlight = graph.findCheapestFlight(origin, destination);
        
        System.out.println("The cheapest flight from " + origin + " to " + destination + " costs " + cheapestFlight + " dollars.");
    }
    
}