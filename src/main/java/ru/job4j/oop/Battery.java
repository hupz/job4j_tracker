package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void exchange(Battery another) {
        this.load = this.load + another.load;
        if (this.load == 100) {
           this.load = 0;
       }
    }

    public static void main(String[] args) {

    }
}
