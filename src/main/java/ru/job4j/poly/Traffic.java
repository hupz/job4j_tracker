package ru.job4j.poly;

public class Traffic {
    public static void main(String[] args) {
        Vehicle autobus = new Autobus();
        Vehicle train = new Train();
        Vehicle plane = new Plane();

        Vehicle[] vehicles = new Vehicle[] {autobus, train, plane};
        for (Vehicle a : vehicles) {
            a.move();
        }
    }
}
