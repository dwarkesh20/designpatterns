package designpatterns.behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

// Mediator interface
interface SmartHomeMediator {
    void registerDevice(SmartDevice device);

    void notify(String message, SmartDevice sender);
}

// Concrete Mediator
class SmartHomeHub implements SmartHomeMediator {
    private List<SmartDevice> devices;

    public SmartHomeHub() {
        this.devices = new ArrayList<>();
    }

    @Override
    public void registerDevice(SmartDevice device) {
        devices.add(device);
    }

    @Override
    public void notify(String message, SmartDevice sender) {
        for (SmartDevice device : devices) {
            // Notify all devices except the sender
            if (device != sender) {
                device.receiveNotification(message);
            }
        }
    }
}

// Colleague interface
interface SmartDevice {
    String getName();

    void sendMessage(String message);

    void receiveNotification(String message);
}

// Concrete Colleague
class SmartLight implements SmartDevice {
    private String name;
    private SmartHomeMediator mediator;

    public SmartLight(String name, SmartHomeMediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.registerDevice(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(name + " sends message: " + message);
        mediator.notify(message, this);
    }

    @Override
    public void receiveNotification(String message) {
        System.out.println(name + " receives notification: " + message);
    }
}

// Concrete Colleague
class SmartThermostat implements SmartDevice {
    private String name;
    private SmartHomeMediator mediator;

    public SmartThermostat(String name, SmartHomeMediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.registerDevice(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(name + " sends message: " + message);
        mediator.notify(message, this);
    }

    @Override
    public void receiveNotification(String message) {
        System.out.println(name + " receives notification: " + message);
    }
}

// Client code
public class SmartHome {
    public static void main(String[] args) {
        SmartHomeMediator smartHomeHub = new SmartHomeHub();

        SmartDevice light = new SmartLight("Living Room Light", smartHomeHub);
        SmartDevice thermostat = new SmartThermostat("Main Thermostat", smartHomeHub);

        light.sendMessage("Turn on the lights in the living room.");
        thermostat.sendMessage("Set temperature to 72°F.");

        // Other devices and interactions can be added as needed
    }
}

