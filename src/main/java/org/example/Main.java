package org.example;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.patronymic = "Иванович";
        post.passport = "1234567890";
        post.phone = "+7 (123) 456-78-90";
        post.surname = "Иванов";
        post.subscription = true;

        Data birthday = new Data();
        birthday.day = 13;
        birthday.month = 6;
        birthday.year = 1999;

        post.birthday = birthday;

        // Теперь объект post полностью заполнен
    }
}