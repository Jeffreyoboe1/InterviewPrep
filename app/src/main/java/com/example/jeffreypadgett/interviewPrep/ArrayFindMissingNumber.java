package com.example.jeffreypadgett.interviewPrep;

import android.util.Log;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayFindMissingNumber {

    /* Find the missing number in this integer array.*/
    /* Given a list of n-1 integers and these integers are in the range of 1 to n.
       There are no duplicates in list. One of the integers is missing in the list.
       Write an efficient code to find the missing integer.

       Input : arr[] = [1, 2, 3, 4, 6, 7, 8]
       Output : 5

       Input : arr[] = [1, 2, 3, 4, 5, 6, 8, 9]
       Output : 7
    */

    String TAG = "ArrayFindMissingNumber";

    public static int findMissingNumberUsingForLoop (int array[]) {

        Arrays.sort(array);

        for(int i = 0; i < array.length; i++) {

            if (i+1 == array[i]) {
                // number is the same, is sequential, starting at 1.
            } else {
                return array[i];
            }

        }

        return 0;

    }

    public static int findMissingNumberMath (int array[]) {
        Arrays.sort(array);

        int sum = 0;
        int sumShouldBe = 0;
        int size = array.length;
        int init[] = new int[array.length+1];

        for (int j = 0; j< init.length; j++) {

            sumShouldBe += j + 1;
        }


        for (int i: array) {
            sum += array[i];

        }

        int missingNum = sumShouldBe - sum;
        return missingNum;






    }







    public void printArray (int intArray[]) {

        for (int i: intArray) {

            Log.d(TAG, i+"");
            System.out.println(TAG + i + "");

        }
    }

    public void printArray2 (int intArray[]) {

        for (int i = 0; i<intArray.length; i++) {
            int number = intArray[i];
            System.out.println(TAG + number + "");
        }


    }

    public void printRandomArraySize(int size) {
        int[] randomArray = new int[size];

        int lengthIs = randomArray.length;
        System.out.println(TAG + "length of random array = " + lengthIs + "");

    }

    public void findMissingNumberInArray(int array[]) {


    }





}
