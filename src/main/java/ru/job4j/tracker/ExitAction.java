package ru.job4j.tracker;

public class ExitAction  implements UserAction {
    public ExitAction(Output output) {
    }

    @Override
    public String name() {
        return "Exit";
    }

    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}
