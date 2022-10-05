package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book bookFirst = new Book("Clean code", 874);
        Book bookSecond = new Book("Java for Lamers", 912);
        Book bookThird = new Book("C# via CLR", 852);
        Book bookFour = new Book("1C для маленьких", 561);
        Book[] books = new Book[4];
        books[0] = bookFirst;
        books[1] = bookSecond;
        books[2] = bookThird;
        books[3] = bookFour;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getCostList());
        }
        Book bk = books[3];
        books[3] = books[0];
        books[0] = bk;
        for (int index = 0; index < books.length; index++) {
            bk = books[index];
            System.out.println(System.lineSeparator() + bk.getName() + " - " + bk.getCostList());
        }
        for (Book book : books) {
            bk = book;
            if ("Clean code".equals(bk.getName())) {
                System.out.println(System.lineSeparator() + bk.getName() + " - " + bk.getCostList());
            }
        }
    }
}
