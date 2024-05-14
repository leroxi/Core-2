package CORE2;

import java.util.ArrayList;
import java.util.List;
// TODO: Учет заказов:
//  Создайте класс Order с полями id, customer и totalAmount.
//  Создайте метод, который будет принимать список заказов и выводить заказы с наибольшей суммой.
//  Создайте метод, который будет принимать список заказов и возвращать общую сумму всех заказов.

public class Order {
    public static void main(String[] args) {
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

    }

    private int id;
    private String customer;
    private Double totalAmount;

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

    public static Double getMaxTotalAmount(List<Order> list) {
        Double maxValue = list.getFirst().totalAmount;
        for (Order i : list) {
            if (maxValue < i.totalAmount) {
                maxValue = i.totalAmount;
            }

        }
        return maxValue;
    }

    public static Double getSumOfAllAmounts(List<Order> list1) {
        Double sumOfAmounts = 0.0;
        for (Order i : list1) {
            sumOfAmounts = sumOfAmounts + i.totalAmount;
        }
        return sumOfAmounts;
    }
}
