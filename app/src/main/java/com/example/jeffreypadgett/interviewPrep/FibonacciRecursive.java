package com.example.jeffreypadgett.interviewPrep;

public class FibonacciRecursive {
    // fibonacci sequence is:  0, 1, 1, 2, 3, 5, 8, 13, 21, 38, 59, etc.
    // recursive means a method that calls upon itself in a repetitive way.
    // we know that first two positions are 0 and 1.

    // return the nth Number of the fibonaccia sequence.  Where 0 = 0 ( I think that means zero indexed.  1st number = 1, 2nd number = 2, etc.

    public static int returnThisNumberOfTheSequence (int x) {

        if (x<2) {
            return x;
        }

        // if 2, should be... 0 + 1
        // if 3, should be... 1 = 1, 2 = 1, 3 = 2, 4 = 5;

        return returnThisNumberOfTheSequence(x-1) + returnThisNumberOfTheSequence(x-2);


    }


}
