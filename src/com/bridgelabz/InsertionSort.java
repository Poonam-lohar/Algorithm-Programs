package com.bridgelabz;
/*
Reads in strings and prints them in sorted order using insertion sort.
 I/P -> read in the list words
 Logic -> Use Insertion Sort to sort the words in the String array
 O/P -> Print the Sorted List
 */
public class InsertionSort {

    public static void main(String[] args) {
        //create object for insertion sort
        InsertionSort insertionSort = new InsertionSort();
        String[] array = {"Pink", "Red", "Purple", "Orange","Maroom"};
        System.out.println("Before Insertion Sort");

        for (int i = 0; i < array.length; i++) {

            System.out.print("   " + array[i]);
        }
        System.out.println("\n");

        System.out.println("After Insertion Sort");

        String[] sortedArray = insertionSort.sort(array);

        for (int i = 0; i < sortedArray.length; i++) {

            System.out.print("   " + sortedArray[i]);
        }
    }

    public String[] sort(String array[]) {

        String temp = " ";
        int arrayLength = array.length;

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
