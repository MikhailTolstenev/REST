package ru.netology.rest.exeption;

public class InvalidCredentials extends RuntimeException {
    public InvalidCredentials(String msg) {

        super(msg);
    }
}