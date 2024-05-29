package task.collection;

// TODO: Учет посещаемости:
//  Создайте класс Student с полями name и attendance.
//  Создайте метод, который будет принимать список студентов и выводить студентов с наихудшей посещаемостью.
//  Создайте метод, который будет принимать список студентов и возвращать среднюю посещаемость.
public class Student2 {

    public String name;
    public Double attendance;

    public Student2(String name, Double attendance) {
        this.name = name;
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name = " + name + '\'' +
                ", attendance = " + attendance +
                '}';
    }

}
