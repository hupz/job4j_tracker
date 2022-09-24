package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public void printInfo() {
        System.out.println("Program work? true or false: " + active);
        System.out.println("How much error in program? - " + status);
        System.out.println("Message for developer: " + message);
    }

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error error1 = new Error(false, 1, "You program don't work");
        error1.printInfo();
        Error error2 = new Error(true, 1, "The program is running with an error");
        error2.printInfo();
    }
}
