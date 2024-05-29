package task.collection;

// TODO: Управление задачами:
//  Создайте класс Task с полями id, title и isCompleted.
//  Создайте метод, который будет принимать список задач и выводить только незавершенные задачи на экран.
//  Создайте метод, который будет принимать список задач и возвращать список задач с определенным заголовком.

public class Task {


    private int id;
    public String title;
    public Boolean completed;

    public Task(int id, String title, Boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id = " + id + '\'' +
                ", title = " + title +
                ", completed = " + completed +
                '}';
    }
}
