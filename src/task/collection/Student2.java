package task.collection;

import java.util.ArrayList;
import java.util.List;

// TODO: Учет посещаемости:
//  Создайте класс Student с полями name и attendance.
//  Создайте метод, который будет принимать список студентов и выводить студентов с наихудшей посещаемостью.
//  Создайте метод, который будет принимать список студентов и возвращать среднюю посещаемость.
public class Student2 {
    public static void main(String[] args) {
        Student2 vladimir = new Student2("Vladimir", 5.6);
        Student2 lera = new Student2("Lera", 3.2);
        Student2 angelina = new Student2("Angelina", 9.1);
        Student2 hohotun = new Student2("Hohotun", 1.2);
        ArrayList<Student2> studentList1 = new ArrayList<>();
        studentList1.add(vladimir);
        studentList1.add(lera);
        studentList1.add(angelina);
        studentList1.add(hohotun);
        System.out.println("Студент с худшей успеваемостью --> " + getWorstAttendance(studentList1));
        System.out.println("Средняя посещаемость --> " + getAvargeAttendance(studentList1));
    }

    private String name;
    private Double attendance;

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

    public static Student2 getWorstAttendance(List<Student2> list) {
        Double theWorstAttendance = Double.MAX_VALUE;
        Student2 worstAttendence = new Student2(" null ", 0.0);
        for (Student2 i : list) {
            if (i.attendance < theWorstAttendance) {
                worstAttendence.name = i.name;
                worstAttendence.attendance = i.attendance;
            }
        }
        return worstAttendence;
    }

    public static Double getAvargeAttendance(List<Student2> list) {
        Double avargeAttendance = 0.0;
        int students = list.size();
        for (Student2 i : list) {
            avargeAttendance = i.attendance + avargeAttendance;
        }
        avargeAttendance = avargeAttendance / students;
        return avargeAttendance;
    }

}
