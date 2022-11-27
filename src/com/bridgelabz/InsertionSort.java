package com.bridgelabz;

public class InsertionSort {
    /*
         * create a main method all program execute in main method
     * @param args no arguments
     */
    public static void main(String[] args) {
        /**
         *
         *create object for InsertionSort class
         */
        InsertionSort insertionSort = new InsertionSort();
        /**
         * create array list
         */
        String[] array = { "blue", "red", "pink", "yellow","orange" };

        System.out.println("Before Insertion Sort");

        for (int i = 0; i < array.length; i++) {
            System.out.print("   "+array[i]);
        }
        System.out.println();

        System.out.println("After Insertion Sort");

        String[] sortedArray = insertionSort.sort(array);

        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print("   "+sortedArray[i]);
        }
    }

    /**
     * create a method name as sort this is String array type method and parameterized method
     */
    public String[] sort(String array[]) {
        /**
         * Variable 'temp' initializer '" "' is redundant
         */
        String temp = " ";
        int arrayLength=array.length;
        /**
         * using for loop
         */
        for (int i = 0; i < arrayLength; i++) {
            for (int j = i + 1; j < arrayLength; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
