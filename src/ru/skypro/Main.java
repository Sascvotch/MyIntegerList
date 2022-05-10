package ru.skypro;


public class Main {

    public static void main(String[] args) throws MyIntegerList.MyException {
        MyIntegerList myIntegerList = new MyIntegerList(0);
        myIntegerList = myIntegerList.generateRandomArray(100000);

        MyIntegerList arrSortInsertion = new MyIntegerList(0);
        arrSortInsertion = arrSortInsertion.copy(myIntegerList);

        long start3 = System.currentTimeMillis();
        arrSortInsertion.sortInsertion();
        System.out.println("время сорт инсекшен" + (System.currentTimeMillis() - start3));
        System.out.println(myIntegerList.BinarySearch(myIntegerList, 143345));

        //MyIntegerList arrSortBuble = new MyIntegerList(0);
        //MyIntegerList arrSortSelection = new MyIntegerList(0);
        //arrSortBuble = arrSortBuble.copy(myIntegerList);
        //arrSortSelection = arrSortSelection.copy(myIntegerList);
        // long start1 = System.currentTimeMillis();
        // arrSortBuble.sortBubble();
        //System.out.println("время сорт бабл"+(System.currentTimeMillis() - start1));
        //System.out.println("arrSortBuble" + arrSortBuble.toString());
        //long start2= System.currentTimeMillis();
        // arrSortSelection.sortSelection();
        //    System.out.println("время сорт селекшен"+(System.currentTimeMillis() - start2));
        // System.out.println("arrSortSelection" + arrSortSelection.toString());


    }


}
