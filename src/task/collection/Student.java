package CORE2;

import java.util.ArrayList;
import java.util.List;
// TODO: Создание списка студентов:
//  Создайте класс Student с полями name и age.
//  Создайте метод, который будет принимать список студентов и выводить их на экран.
//  Создайте метод, который будет принимать список студентов и возвращать список студентов, у которых возраст больше определенного значения.

public class Student {
    public static void main(String[] args) {
        Student alexey = new Student("Alexey", 12);
        Student ivan = new Student("Ivan", 16);
        Student sergey = new Student("Sergey", 7);
        Student chivapchich = new Student("Chivapchich", 22);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(alexey);
        studentList.add(ivan);
        studentList.add(sergey);
        studentList.add(chivapchich);
        studentListOut(studentList);
        System.out.println("Студенты старше 15 лет --> " + whoIsAdult(studentList));
    }

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name = " + name + '\'' +
                ", age = " + age +
                '}';
    }

    public static void studentListOut(List<Student> list) {
        System.out.println(list);
    }

    public static List whoIsAdult(List<Student> list) {
        ArrayList<Student> adultStudents = new ArrayList<>();
        for (Student i : list) {
            if (i.age > 15) {
                adultStudents.add(i);
            }
        }
        return adultStudents;
    }


}
