package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI extends Item{
    public static void main(String[] args) {
        Item data = new Item();
        LocalDateTime dataTime = data.created;
        System.out.println("Текущие дата и время: " + dataTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String dataTimeFormat = dataTime.format(formatter);
        System.out.println("Текущие дата и время: " + dataTimeFormat);
    }
}
