package ru.netology.chain.responsibility;

public class EmailNotifier extends Notifier {
    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Оповещение с помощью email: " + message);
    }
}
