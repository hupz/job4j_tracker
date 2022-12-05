package ru.job4j.tracker;

public class SearchNameAction implements UserAction {
    private final Output out;

    public SearchNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find item for Name";
    }

    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find items by name ===");
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                out.println(item);
            }
        } else {
            out.println("Заявки с именем: " + name + " не найдены.");
        }
        return true;
    }
}
