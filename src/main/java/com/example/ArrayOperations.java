package com.example;

import java.util.Arrays;

public class ArrayOperations {

    public static void main(String[] args) {
        // Exercise 1: Initialize and Print an Array
        // TODO: Initialize an array of integers and print its contents.
        int[] exampleArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(exampleArray));
    }

    // Exercise 2: Find the Maximum Value in an Array
    public static int findMaximumValue(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    // Exercise 3: Check for a Specific Value
    public static boolean containsValue(int[] array, int value) {
        for (int element : array) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }

    // Exercise 4: Calculate the Average of Array Elements
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (double) sum / array.length;
    }

    // Exercise 5: Reverse an Array
    public static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }

    // Exercise 6: Sort an Array
    public static void sortArray(int[] array) {
        Arrays.sort(array);
    }
}