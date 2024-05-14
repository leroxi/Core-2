package task.collection;

import java.util.ArrayList;
import java.util.List;
// TODO: Управление задачами:
//  Создайте класс Task с полями id, title и isCompleted.
//  Создайте метод, который будет принимать список задач и выводить только незавершенные задачи на экран.
//  Создайте метод, который будет принимать список задач и возвращать список задач с определенным заголовком.

public class Task {
    public static void main(String[] args) {
        Task task1 = new Task(1, "Вычитание", true);
        Task task2 = new Task(2, "Сумма", false);
        Task task3 = new Task(3, "Деление", true);
        Task task4 = new Task(4, "Произведение", false);
        ArrayList<Task> taskList = new ArrayList<>();
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);
        taskList.add(task4);
        System.out.println("Не выполненные задания --> " + getFalseTasks(taskList));
        System.out.println("Задание с названием 'Сумма' --> " + getNamedTask(taskList));
    }

    private int id;
    private String title;
    private Boolean completed;

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

    public static List getFalseTasks(List<Task> list) {
        ArrayList<Task> listOfUncompletedTasks = new ArrayList<>();
        for (Task i : list) {
            if (i.completed == false) {
                listOfUncompletedTasks.add(i);
            }
        }
        return listOfUncompletedTasks;
    }

    public static List getNamedTask(List<Task> list) {
        ArrayList<Task> listOfUniqueName = new ArrayList<>();
        for (Task i : list) {
            if (i.title == "Сумма") {
                listOfUniqueName.add(i);
            }
        }
        return listOfUniqueName;
    }
}
