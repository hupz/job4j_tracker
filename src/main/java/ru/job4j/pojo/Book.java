package ru.job4j.pojo;

public class Book {
    private String name;
    private int costList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCostList() {
        return costList;
    }

    public void setCostList(int costList) {
        this.costList = costList;
    }

    public Book(String name, int costList) {
        this.name = name;
        this.costList = costList;
    }
}
