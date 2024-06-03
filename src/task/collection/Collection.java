package task.collection;

import java.util.*;

public class Collection {
    public static void main(String[] args) {

        // TODO: Найти наибольший элемент в списке.
        ArrayList<Integer> list1 = new ArrayList<>();
        int maxValue = Integer.MIN_VALUE;
        list1.add(1);
        list1.add(6);
        list1.add(3);
        list1.add(19);
        System.out.println("1) " + Collections.max(list1));
        // TODO: Удалить все дубликаты из списка.
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(19);
        list2.add(6);
        list2.add(19);
        list2.add(3);
        list2.add(19);
        System.out.println("2) " + "Список с дубликатами --> " + list2);
        List<Integer> list21 = new ArrayList<>();
        for (Integer x : list2) {
            if (!list21.contains(x)) {
                list21.add(x);
            }
        }
        list2 = list21;
        System.out.println("2) " + "Список без дубликатов --> " + list2);

        // TODO: Отсортировать список в порядке убывания.
        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(19);
        list3.add(6);
        list3.add(19);
        list3.add(3);
        list3.add(4);
        Collections.sort(list3);
        Collections.reverse(list3);
        System.out.println("3) " + list3);

        // TODO: Проверить, содержит ли множество определенный элемент.
        Set<Integer> set1 = new HashSet<>();
        for (int i = 1; i < 7; i++) {
            set1.add(i);
        }
        set1.contains(3);
        System.out.println("4) " + set1.contains(3));

        // TODO: Найти пересечение двух множеств.
        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(4);
        set2.add(6);
        set2.add(8);
        Set<Integer> intersect = new HashSet<>(set1);
        intersect.retainAll(set2);
        System.out.println("5) " + intersect);

        // TODO: Удалить все элементы из множества, которые также содержатся в другом множестве.

        set1.removeAll(set2);
        System.out.println("6) " + set1);

        // TODO: Проверить, содержит ли карта определенный ключ.
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(5001, "First value");
        map1.put(5002, "Second value");
        map1.put(5003, "Third value");
        map1.put(5004, "Fourth value");
        System.out.println("7) " + map1.containsKey(5002));
        // TODO: Получить все значения, связанные с определенным ключом.
        Map<Integer, String> map2 = new HashMap<>();
        map2.put(5001, "First value");
        map2.put(5002, "Second value");
        map2.put(5003, "Third value");
        map2.put(5004, "Fourth value");
        map2.get(5002);
        System.out.println("8) " + map2.get(5002));
        // TODO: Удалить все записи из карты, у которых значение равно определенному значению.
        Map<Integer, String> map3 = new HashMap<>();
        map3.put(5001, "First value");
        map3.put(5002, "Second value");
        map3.put(5003, "Third value");
        map3.put(5004, "Fourth value");
        map3.remove(5002);
        System.out.println("9) " + map3);
        // TODO: Добавить элемент в очередь.
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.offer(5);
        System.out.println("10) " + queue1);
        // TODO: Получить и удалить первый элемент из очереди.
        Queue<Integer> queue2 = new LinkedList<>();
        queue2.offer(5);
        queue2.offer(4);
        queue2.offer(3);
        queue2.offer(2);
        queue2.peek();
        queue2.remove();
        System.out.println("11) " + queue2);
        // TODO: Проверить, пуста ли очередь.
        Queue<Integer> queue3 = new LinkedList<>();
        queue3.isEmpty();
        System.out.println("12) " + queue3.isEmpty());


    }

    public static Double getMaxTotalAmount(List<Order> listOfAmounts) {
        Double maxValue = listOfAmounts.getFirst().getTotalAmount();
        for (Order i : listOfAmounts) {
            if (maxValue < i.getTotalAmount()) {
                maxValue = i.getTotalAmount();
            }

        }
        return maxValue;
    }

    public static Double getSumOfAllAmounts(List<Order> listOfAmounts) {
        Double sumOfAmounts = 0.0;
        for (Order i : listOfAmounts) {
            sumOfAmounts = sumOfAmounts + i.getTotalAmount();
        }
        return sumOfAmounts;
    }

    public static void studentListOut(List<Student> listOfStudents) {
        System.out.println(listOfStudents);
    }

    public static List<Student> listOfStudents(List<Student> listOfStudents) {
        ArrayList<Student> adultStudents = new ArrayList<>();
        for (Student i : listOfStudents) {
            if (i.getAge() > 15) {
                adultStudents.add(i);
            }
        }
        return adultStudents;
    }

    public static List<Product> getZeroQuantityProducts(List<Product> listOfProducts) {
        ArrayList<Product> nullProducts = new ArrayList<>();
        for (Product i : listOfProducts) {
            if (i.getQuantity() == 0) {
                nullProducts.add(i);
            }
        }
        return nullProducts;
    }

    public static Integer getValueOfAllProducts(List<Product> listOfProducts) {
        Integer sumOfAllProducts = 0;
        for (Product i : listOfProducts) {
            sumOfAllProducts = i.getQuantity() + sumOfAllProducts;
        }
        return sumOfAllProducts;
    }

    public static Student2 getWorstAttendance(List<Student2> listOfStudents) {
        Double theWorstAttendance = Double.MAX_VALUE;
        Student2 worstAttendance = new Student2(" ZOLA ", 0.0);
        for (Student2 i : listOfStudents) {
            if (i.getAttendance() < theWorstAttendance) {
                worstAttendance = i;
            }
        }
        return worstAttendance;
    }

    public static Double getAverageAttendance(List<Student2> listOfStudents) {
        Double avargeAttendance = 0.0;
        int students = listOfStudents.size();
        for (Student2 i : listOfStudents) {
            avargeAttendance = i.getAttendance() + avargeAttendance;
        }
        avargeAttendance = avargeAttendance / students;
        return avargeAttendance;
    }

    public static List<Task> getUnfinishedTasks(List<Task> listOfTasks) {
        ArrayList<Task> listOfUncompletedTasks = new ArrayList<>();
        for (Task i : listOfTasks) {
            if (i.getCompleted().equals(false)) {
                listOfUncompletedTasks.add(i);
            }
        }
        return listOfUncompletedTasks;
    }

    public static List<Task> getSpecificTitleTask(List<Task> listOfTasks) {
        ArrayList<Task> listOfUniqueName = new ArrayList<>();
        for (Task i : listOfTasks) {
            if (i.getTitle().equals("Сумма")) {
                listOfUniqueName.add(i);
            }
        }
        return listOfUniqueName;
    }
}
