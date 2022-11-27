package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Getting the input string from the user
        System.out.print("Enter the First String : ");
        String s1 = scanner.nextLine();

        System.out.print("Enter the second String : ");
        String s2 = scanner.nextLine();

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        if (c1.length == c2.length)

        {
            Arrays.sort(c1);
            Arrays.sort(c2);

            int temp = 0;

            for (int i = 0; i < c1.length; i++) {

                if (c1[i] != c2[i]) {
                    temp = temp + 1;
                }
            }

        if (temp==0)
            System.out.println("The two strings are Anagrams");

        else
            System.out.println("The two are NOT Anagrams");
        scanner.close();
    }
    }
}

