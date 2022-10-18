package ru.netology.observer;

import java.util.List;

public class Subscriber implements Observer{

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.printf("Дорогой %s, есть изменения в вакансиях: %s\n", name, vacancies);
    }
}
