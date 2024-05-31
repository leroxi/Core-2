package task.models;

import java.util.ArrayList;
import java.util.List;


public class TestBox {


    public static void main(String[] args) {
        ArrayList<BigBox> boxList = new ArrayList<>();
        boxList.add(generateBigBox());
        boxList.add(generateMediumBox());
        boxList.add(generateSmallBox());
        System.out.println(boxList);
        generateMediumBox();
        MediumBox mediumBox1 = new MediumBox();
        mediumBox1.setSmallBox(generateSmallBox());
        mediumBox1.setHeight(15);
       mediumBox1.setLength(15);
       mediumBox1.setSize("medium");
       mediumBox1.setWidth(15);
       addBoxToList(boxList, mediumBox1);
       System.out.println(mediumBox1);
       ArrayList<BigBox> sourceList = new ArrayList<>();
       sourceList.add(generateBigBox());
       sourceList.add(generateMediumBox());
       sourceList.add(generateSmallBox());
       sourceList.add(generateMicroBox());

    }

    //TODO: Сделайте рефакторинг метода так , что бы это метод мог работать не только с BigBox , а еще и с любыми его наследниками
    //  используйте для этого дженерики
    public static <E extends BigBox> boolean checkBoxInList(List<E> list, E item) {
        return list.contains(item);
    }

    //TODO: Таким же образом реализуйте метод добавления коробок в список при помощи дженериков . Тоесть , этот метод будет принимать
    // BigBox и его наследников и добавлять в список BigBox и его наследников
    public static <Y extends BigBox> void addBoxToList(List<Y> list1, Y box) {
        list1.add(box);
        System.out.println(list1);
    }

    //TODO: Так же реализуйте метод который будет проходится по списку с MediumBox и его наследников и выводить на экран содежимое каждого элемента
    public static <F extends MediumBox> void printBoxList(List<F> list2) {
        for (F i : list2) {
            System.out.println(i);
        }
    }

    //TODO: реализуйте Метод для копирования элементов из одного списка с BigBox и его наследников в другой список BigBox и его наследников
    public static <B extends BigBox> void copyBoxes(List<B> sourceList) {
        ArrayList<B> targetList;
        targetList = (ArrayList<B>) new ArrayList<>(sourceList);
    }

    private static BigBox generateBigBox() {
        BigBox bigBox = new BigBox();
        bigBox.setMediumBox(generateMediumBox());
        bigBox.setHeight(20);
        bigBox.setLength(20);
        bigBox.setSize("big");
        bigBox.setWidth(20);
        return bigBox;
    }

    private static MediumBox generateMediumBox() {
        MediumBox mediumBox = new MediumBox();
        mediumBox.setSmallBox(generateSmallBox());
        mediumBox.setHeight(15);
        mediumBox.setLength(15);
        mediumBox.setSize("medium");
        mediumBox.setWidth(15);
        return mediumBox;
    }

    private static SmallBox generateSmallBox() {
        SmallBox smallBox = new SmallBox();
        smallBox.setMicroBox(generateMicroBox());
        smallBox.setHeight(10);
        smallBox.setLength(10);
        smallBox.setSize("small");
        smallBox.setWidth(10);
        return smallBox;
    }

    private static MicroBox generateMicroBox() {
        MicroBox microBox = new MicroBox();
        microBox.setHeight(5);
        microBox.setLength(5);
        microBox.setSize("small");
        microBox.setWidth(5);
        return microBox;
    }
}
