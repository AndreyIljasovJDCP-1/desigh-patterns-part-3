package ru.netology.chain.responsibility;

public class BugReport {

    public static void main(String[] args) {
        JiraNotifier jiraNotifier = new JiraNotifier(Priority.ROUTINE);
        EmailNotifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        SmsNotifier smsNotifier = new SmsNotifier(Priority.CRITICAL);

        jiraNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        jiraNotifier.notifyManager("Все хорошо!", Priority.ROUTINE);
        System.out.println("------------");
        jiraNotifier.notifyManager("Критическая ошибка!", Priority.IMPORTANT);
        System.out.println("-------------");
        jiraNotifier.notifyManager("Все пропало!", Priority.CRITICAL);
    }
}
