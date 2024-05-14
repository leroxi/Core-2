package task.collection;

import java.util.ArrayList;
import java.util.List;
// TODO: Учет товаров на складе:
//  Создайте класс Product с полями id, name и quantity.
//  Создайте метод, который будет принимать список товаров и выводить только товары с нулевым количеством на складе.
//  Создайте метод, который будет принимать список товаров и возвращать общее количество товаров на складе.

public class Product {
    public static void main(String[] args) {
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
        System.out.println("Закончились --> " + getNullProducts(productList));
        System.out.println("Сумма всех товаров на складе --> " + getValueOfAllProducts(productList));

    }

    private int id;
    private String name;
    private int quantity;

    public Product(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id = " + id + '\'' +
                ", name = " + name +
                ", quantity = " + quantity +
                '}';
    }

    public static List getNullProducts(List<Product> list) {
        ArrayList<Product> nullProducts = new ArrayList<>();
        for (Product i : list) {
            if (i.quantity == 0) {
                nullProducts.add(i);
            }
        }
        return nullProducts;
    }

    public static Integer getValueOfAllProducts(List<Product> list) {
        Integer sumOfAllProducts = 0;
        for (Product i : list) {
            sumOfAllProducts = i.quantity + sumOfAllProducts;
        }
        return sumOfAllProducts;
    }
}


