package CORE2;

// TODO: Учет заказов:
//  Создайте класс Order с полями id, customer и totalAmount.
//  Создайте метод, который будет принимать список заказов и выводить заказы с наибольшей суммой.
//  Создайте метод, который будет принимать список заказов и возвращать общую сумму всех заказов.

public class Order {

    private int id;
    private String customer;
    public Double totalAmount;

    public Order(int id, String customer, double totalAmount) {
        this.id = id;
        this.customer = customer;
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id = " + id + '\'' +
                ", customer = " + customer +
                ", totalAmount = " + totalAmount +
                '}';
    }

}
