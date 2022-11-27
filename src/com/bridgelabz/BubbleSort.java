package com.bridgelabz;
/*
Problem:
 Reads in integers prints them in sorted order using Bubble Sort
 I/P -> read in the list ints
 O/P -> Print the Sorted List
 */

public class BubbleSort <T extends Comparable<T>> {

    public static void main(String[] args) {

        System.out.println(".......Welcome To Algorithm Programms....");

        Integer[] a = {10, 5, 20, 25, 11, 15};
        int n = a.length;
        int temp;
        /*
        here for loop uses to access each array element.
         */

        for (int i = 0; i < n; i++) {
            /*
            here for loop uses to compare array elements
             */
            for (int j = 0; j < n - 1 - i; j++) {

                if (a[j].compareTo( a[j + 1]) > 0) {
                    /*
                    swapping
                     */
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        for (int i : a) {

            System.out.print(i + " ");
        }
    }
}