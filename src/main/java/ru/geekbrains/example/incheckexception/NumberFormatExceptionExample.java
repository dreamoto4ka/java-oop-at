package ru.geekbrains.example.incheckexception;

public class NumberFormatExceptionExample {

    public static void main(String[] args) {
        String number = "строка";
        System.out.println(Integer.parseInt(number));
    }
}