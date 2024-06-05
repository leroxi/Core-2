package CORE2;

import java.util.ArrayList;

public class Main extends Collection {
    public static void main(String[] args) {
        String typeOfTask = "Сумма";
        Order order1 = new Order(1, "Sergey", 5430);
        Order order2 = new Order(2, "Alexey", 350);
        Order order3 = new Order(3, "Matvey", 2030);
        Order order4 = new Order(4, "Vladimir", 1134);
        ArrayList<Order> orderList = new ArrayList<>();
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
        orderList.add(order4);
        System.out.println("Максимальный чек заказа --> " + getMaxTotalAmount(orderList));
        System.out.println("Сумма всех заказов --> " + getSumOfAllAmounts(orderList));

        Task task1 = new Task(1, "Вычитание", true);
        Task task2 = new Task(2, "Сумма", false);
        Task task3 = new Task(3, "Деление", true);
        Task task4 = new Task(4, "Произведение", false);
        ArrayList<Task> taskList = new ArrayList<>();
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);
        taskList.add(task4);
        System.out.println("Не выполненные задания --> " + getUnfinishedTasks(taskList));
        System.out.println("Задание с названием 'Сумма' --> " + getSpecificTitleTask(taskList, typeOfTask));

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
        System.out.println("Студенты старше 15 лет --> " + listOfStudents(studentList));

        Product product1 = new Product(101, "Milk", 56);
        Product product2 = new Product(102, "Bread", 11);
        Product product3 = new Product(103, "Chocolate", 0);
        Product product4 = new Product(104, "Cards", 893);
        Product product5 = new Product(105, "Salt", 0);
        Product product6 = new Product(106, "Dog Food", 123);
        Product product7 = new Product(107, "Orbit", 500);
        Product product8 = new Product(108, "Dirol", 0);
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);
        productList.add(product7);
        productList.add(product8);
        System.out.println("Закончились --> " + getZeroQuantityProducts(productList));
        System.out.println("Сумма всех товаров на складе --> " + getValueOfAllProducts(productList));

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
        System.out.println("Средняя посещаемость --> " + getAverageAttendance(studentList1));
    }

}
