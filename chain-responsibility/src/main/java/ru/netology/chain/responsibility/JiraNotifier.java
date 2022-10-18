package ru.netology.chain.responsibility;

public class JiraNotifier extends Notifier{

    public JiraNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Оповещение менеджера с помощью уведомления в Jira: " + message);
    }
}
