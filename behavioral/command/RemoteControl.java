package designpatterns.behavioral.command;

// Invoker class
class RemoteControl {
    private Command onCommand;
    private Command offCommand;

    public RemoteControl(Command onCommand, Command offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    public void onButton() {
        onCommand.execute();
    }

    public void offButton() {
        offCommand.execute();
    }

    public void setCommand(Command onCommand, Command offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }
}