package ru.job4j.oop;

public class DummyDic {

    public static String engToRus(String eng) {
        return "����������� �����." + eng;
    }

    public static void main(String[] args) {
        System.out.println(engToRus("�����"));
    }
}
