Flight Booking Program
This Java program, BookingAgent, is a flight booking application that allows users to find the shortest route between different cities. It uses the Dijkstra's algorithm to calculate the shortest path.

Installation
To run this program, you need to have Java Development Kit (JDK) installed on your machine.

Download and install JDK from the official Oracle website: Java SE Development Kit Downloads.

Clone this repository to your local machine using the following command:

bash
Copy code
git clone https://github.com/your-username/flight-booking.git
Usage
Open a command prompt or terminal and navigate to the project directory.

Compile the BookingAgent.java file using the following command:

bash
Copy code
javac BookingAgent.java
Run the program using the following command:
bash
Copy code
java BookingAgent
Follow the instructions displayed on the console to select the origin and destination cities. Type 'exit' to quit the program.
Description
The program uses a Graph data structure to represent the flights between cities. It initializes the graph with predefined flight routes and costs.

The DijkstraAlgorithm class implements the Dijkstra's algorithm to find the shortest path between two cities in the graph.

The program prompts the user to select an origin city and a destination city. It then calculates and displays the shortest route between the chosen cities.

Example
vbnet
Copy code
Welcome to the Flight Booking program!

Please select a city of origin: Miami, New York, Dallas, Atlanta, Los Angeles, or type 'exit' to quit.
> Miami
Please select your destination: Miami, New York, Dallas, Atlanta, Los Angeles, or type 'exit' to quit.
> Atlanta
The shortest route from Miami to Atlanta is:
[Miami, Atlanta]

Please select a city of origin: Miami, New York, Dallas, Atlanta, Los Angeles, or type 'exit' to quit.
> New York
Please select your destination: Miami, New York, Dallas, Atlanta, Los Angeles, or type 'exit' to quit.
> Los Angeles
The shortest route from New York to Los Angeles is:
[New York, Atlanta, Dallas, Los Angeles]

Please select a city of origin: Miami, New York, Dallas, Atlanta, Los Angeles, or type 'exit' to quit.
> exit

Thank you for using the Flight Booking program!
Contributing
Contributions to this project are welcome. If you find any issues or have suggestions for improvements, please create a new issue or submit a pull request.

License
This project is licensed under the MIT License.
