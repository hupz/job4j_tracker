package ru.job4j.oop;

public class Jukebox {

    public void music(int position) {
        if (position == 1) {
            System.out.println("����� ����� ��������");
        } else if (position == 2) {
            System.out.println("��������� ����");
        } else {
            System.out.println("����� �� �������");
        }
    }

    public static void main(String[] args) {
        Jukebox musicBox = new Jukebox();
        musicBox.music(1);
        musicBox.music(2);
        musicBox.music(3);
    }
}
