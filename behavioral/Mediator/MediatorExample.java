package designpatterns.behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

// Mediator interface
interface AirTrafficControl {
    void registerFlight(Flight flight);

    void requestLanding(Flight flight);

    void grantLandingPermission(Flight flight);

    void requestTakeoff(Flight flight);

    void grantTakeoffPermission(Flight flight);
}

// Concrete Mediator
class AirTrafficControlCenter implements AirTrafficControl {
    private List<Flight> flights;

    public AirTrafficControlCenter() {
        this.flights = new ArrayList<>();
    }

    @Override
    public void registerFlight(Flight flight) {
        flights.add(flight);
    }

    @Override
    public void requestLanding(Flight flight) {
        System.out.println(flight.getName() + " requests landing clearance...");
        // Process landing request logic
        // Check for other flights, weather conditions, etc.
        grantLandingPermission(flight);
    }

    @Override
    public void grantLandingPermission(Flight flight) {
        System.out.println("Landing clearance granted for " + flight.getName());
    }

    @Override
    public void requestTakeoff(Flight flight) {
        System.out.println(flight.getName() + " requests takeoff clearance.");
        // Process takeoff request logic
        // Check for other flights, runway availability, etc.
        grantTakeoffPermission(flight);
    }

    @Override
    public void grantTakeoffPermission(Flight flight) {
        System.out.println("Takeoff clearance granted for " + flight.getName());
    }
}

// Colleague interface
interface Flight {
    String getName();

    void requestLanding();

    void requestTakeoff();
}

// Concrete Colleague
class CommercialFlight implements Flight {
    private String name;
    private AirTrafficControl airTrafficControl;

    public CommercialFlight(String name, AirTrafficControl airTrafficControl) {
        this.name = name;
        this.airTrafficControl = airTrafficControl;
        airTrafficControl.registerFlight(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void requestLanding() {
        airTrafficControl.requestLanding(this);
    }

    @Override
    public void requestTakeoff() {
        airTrafficControl.requestTakeoff(this);
    }
}

// Client code
public class MediatorExample {
    public static void main(String[] args) {
        AirTrafficControl airTrafficControl = new AirTrafficControlCenter();

        Flight flight1 = new CommercialFlight("Flight 1", airTrafficControl);
        Flight flight2 = new CommercialFlight("Flight 2", airTrafficControl);

        flight1.requestLanding();
        flight2.requestTakeoff();
    }
}
