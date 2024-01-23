package ru.netology.rest.exeption;

public class UnauthorizedUser extends RuntimeException {
    public UnauthorizedUser(String msg) {

        super(msg);
    }
}