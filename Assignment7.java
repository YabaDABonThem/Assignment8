// Allen Bao
// CS 211
// 2/10/2022
// Class to test code from ArrayIntList.java.
// I'm not sure why the assignment 8 file is named "Assignment7"

import java.util.Arrays;

public class Assignment7 {
    public static void main(String[] args) {
        // call test methods
        testUpToNowTotal();
        testIsPairSorted();
        testRemoveLast();
    }

    public static void testUpToNowTotal() {
        ArrayIntList myArrayIntList = new ArrayIntList(2, 3, 5, 4, 7, 15, 20, 7);
        ArrayIntList totalList = myArrayIntList.upToNowTotal();
        System.out.println(myArrayIntList.toString());
        System.out.println(totalList.toString());
    }

    public static void testIsPairSorted() {
        // true and odd test
        ArrayIntList myArrayIntList = new ArrayIntList(3, 8, 2, 5, 19, 24, -3, 0, 4, 4, 8, 205, 42);
        System.out.println(myArrayIntList);
        System.out.println(myArrayIntList.isPairSorted());
        // false and even test
        myArrayIntList = new ArrayIntList(1, 9, 3, 17, 4, 28, -5, -3,
                0, 42, 308, 409, 19, 17, 2, 4);
        System.out.println(myArrayIntList);
        System.out.println(myArrayIntList.isPairSorted());
    }

    public static void testRemoveLast() {
        ArrayIntList myArrayIntList = new ArrayIntList(8, 17, 9, 24, 42, 3, 8);
        myArrayIntList.removeLast(4);
        System.out.println(myArrayIntList);
    }
}
