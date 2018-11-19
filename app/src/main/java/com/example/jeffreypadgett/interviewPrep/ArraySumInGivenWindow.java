package com.example.jeffreypadgett.interviewPrep;

import android.util.Log;

import java.util.Arrays;

public class ArraySumInGivenWindow {

    /*
    * Write a method that returns the sum of numbers in an unending array within a given window.
    * */

    static String TAG = "ArraySumInGivenWindow";

    public static int sumOfNumbersInUnEndingArray (int startNumber, int endNumber) {
        int numberOfEntries = endNumber-startNumber + 1;

        int[] array = new int[numberOfEntries];

        Log.d(TAG, "number of Entries: " + numberOfEntries);





        for (int i=0; i<numberOfEntries; i++) {
            array[i] = startNumber + i;
        }



        int sum = Arrays.stream(array).sum();
        Log.d(TAG, "sum of numbers is: " + sum);

        // or sum
        return sum;


    }
}
