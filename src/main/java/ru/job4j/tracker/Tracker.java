package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

        public Item[] findByName(String key) {
            Item[] rsl = new Item[items.length];
            size = 0;
            for (Item name : items) {
                if (name != null) {
                    if (name.getName().equals(key)) {
                        rsl[size] = name;
                        size++;
                    }
                }
            }
            rsl = Arrays.copyOf(rsl, size);
            return rsl;
        }
    }
