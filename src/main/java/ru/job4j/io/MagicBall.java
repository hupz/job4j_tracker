package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Я великий Оракул, задай мне вопрос и я отвечу тебе Да либо Нет!");
        String answer = input.nextLine();
        int answerRandom = new Random().nextInt(3);
        if (answerRandom == 0) {
            System.out.println("Ваш вопрос: " + answer + " Мой ответ Да!");
        } else if (answerRandom == 1) {
            System.out.println("Ваш вопрос: " + answer + " Мой ответ Нет!");
        } else {
            System.out.println("Ваш вопрос: " + answer + " Мой ответ Может быть!");
        }
    }
}
