package ru.netology.command;

public class Demo {

    public static void main(String[] args) {
        Database database = new Database();
        JavaDeveloper javaDeveloper = new JavaDeveloper(
                new SelectCommand(database),
                new UpdateCommand(database),
                new DeleteCommand(database),
                new InsertCommand(database)
        );


        javaDeveloper.insertRecord();
        javaDeveloper.selectRecord();
        javaDeveloper.updateRecord();
        javaDeveloper.deleteRecord();
    }
}
