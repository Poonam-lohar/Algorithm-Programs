package com.bridgelabz;

public class BubbleSort<T extends Comparable<T>> {

    public static void main(String[] args) {

        Integer[] a = {10,5,20,25,11,15};
        int temp;

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length - 1 - i; j++) {

                if (a[j] > a[j + 1]) {

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