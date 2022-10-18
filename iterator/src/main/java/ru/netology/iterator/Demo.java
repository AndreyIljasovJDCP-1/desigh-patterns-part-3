package ru.netology.iterator;

public class Demo {

    static String[] skills = {"Java", "Spring", "Maven", "Kotlin"};

    public static void main(String[] args) {
        JavaDeveloper javaDeveloper = new JavaDeveloper("Max", skills);

        Iterator iterator = javaDeveloper.getIterator();

        System.out.println("Какими навыками обладаете?");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
