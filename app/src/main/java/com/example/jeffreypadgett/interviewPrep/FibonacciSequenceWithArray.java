package com.example.jeffreypadgett.interviewPrep;

public class FibonacciSequenceWithArray {

// Fibonacci is a sequence where each new number is the sum of the previous two numbers.
    // Write program that prints out the nth number in the sequence.
/*
   public static int fibonacci(int index) {

        if (index <=0)
        {return 0;}
        if (index==1);
        { return 1;}

            return fibonacci(index-1) + fibonacci(index-2);
    }
*/

    public static int fibonacciNumberIs (int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int[] fibSequence = new int[n];  // creates an Array of in length of whatever number user put in.

        fibSequence[0] = 0;
        fibSequence[1] = 1;



        for (int i = 2; i <= n-1; i++) {  // Check later
            //i = 2  // n = 2

            fibSequence[i] = fibSequence[i-1] + fibSequence[i-2];  // so, fibS[1] + fibS[0]... = 1
            System.out.println("" + fibSequence[i]);
        }

        System.out.println("" + fibSequence);
        return fibSequence[n-1];


        }


}
