package ru.job4j.encapsulation;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Савченко Максим Викторович");
        student.setGroup("ЗИТ-11");
        student.setReceiptData(new Date());
        System.out.println(student.getFullName() + " зачислен в группу - " + student.getGroup() + ". Дата зачисления : " + student.getReceiptData());
    }
}
