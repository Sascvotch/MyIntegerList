package ru.skypro;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws MyIntegerList.MyException {
        MyIntegerList otherList = new MyIntegerList();
        List<Integer> listFromInteger = Arrays.asList(0, 1, 2, 3, 4);
        otherList.toArray(listFromInteger);

        MyIntegerList myIntegerList = new MyIntegerList();
        myIntegerList.add(0);
        myIntegerList.add(1);
        myIntegerList.add(2);
        myIntegerList.add(8);
        myIntegerList.remove(1);
        myIntegerList.add(1, 3);
        myIntegerList.set(2, 4);
        myIntegerList.equals(otherList);
        myIntegerList.equals(Arrays.asList(6, 3, 4));
        myIntegerList.equals(Arrays.asList(6, 3));
        myIntegerList.size();
        myIntegerList.remove(3);
        myIntegerList.remove(1);
        myIntegerList.contains(6);
        myIntegerList.contains(8);
        myIntegerList.indexOf(0);
        myIntegerList.indexOf(8);
        myIntegerList.lastIndexOf(3);
        myIntegerList.get(0);
        myIntegerList.clear();
        myIntegerList.isEmpty();
        myIntegerList.toArray();

    }
}
