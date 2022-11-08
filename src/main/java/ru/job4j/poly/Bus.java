package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void ride() {
        System.out.println("Начинаем движение!");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Сегодня у нас в автобусе: " + count + " пассажиров");
    }

    @Override
    public int refuel(int fuel) {
        return fuel * 2;
    }
}
