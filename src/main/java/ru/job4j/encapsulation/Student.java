package ru.job4j.encapsulation;

import java.util.Date;

public class Student {
    private String fullName;
    private String group;
    private Date receiptData;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getReceiptData() {
        return receiptData;
    }

    public void setReceiptData(Date receiptData) {
        this.receiptData = receiptData;
    }
}
