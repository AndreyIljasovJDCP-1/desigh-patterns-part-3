package ru.netology.command;

public class JavaDeveloper {

    private Command select;
    private Command update;
    private Command delete;
    private Command insert;

    public JavaDeveloper(Command select, Command update, Command delete, Command insert) {
        this.select = select;
        this.update = update;
        this.delete = delete;
        this.insert = insert;
    }

    public void selectRecord() {
        select.execute();
    }

    public void updateRecord() {
        update.execute();
    }

    public void deleteRecord() {
        delete.execute();
    }

    public void insertRecord() {
        insert.execute();
    }
}
