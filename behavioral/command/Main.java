package designpatterns.behavioral.command;

public class Main {
    public static void main(String[] args) {
        // Create a light and corresponding command
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light),
                lightOffCommand = new LightOffCommand(light);

        // Create a remote control and set the command
        RemoteControl remoteControl = new RemoteControl(lightOnCommand, lightOffCommand);

        // Press the button to execute the command
        remoteControl.onButton(); // Outputs: Light is ON
        // Now, let's turn the light off
        remoteControl.offButton(); // Outputs: Light is OFF

        // use a lambda expression to create the commands
        System.out.println("***lambda expression***");
        Command lightOnCommandLamda = () -> System.out.println("()->Light is ON"),
                lightOffCommandLamda = () -> System.out.println("()->Light is OFF");

        remoteControl.setCommand(lightOnCommandLamda, lightOffCommandLamda);
        remoteControl.onButton(); // Outputs: Light is ON
        remoteControl.offButton(); // Outputs: Light is OFF

    }
}
