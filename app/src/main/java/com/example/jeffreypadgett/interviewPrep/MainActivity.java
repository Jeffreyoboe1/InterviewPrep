package com.example.jeffreypadgett.interviewPrep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    String TAG = "MainActivity";

    String string1;
    String string2;
    String string3;
    String string4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  Button button = null;
        //button.setText("");

        string1 = "GnarlyDude";
        string2 = "  !@#)*(% Wappy is the *(#!@best.!@#$ #@($";
        string3 = null;

        string4 = "";
        int myInt = 12345678;

        String subString = string2.substring(1);

        Log.d(TAG, subString); // uttface is the best.

        String subString2 = string2.substring(4, 6);  //fa
        String subString3 = string2.substring(4, string2.length());
        String subString4 = string2.substring(4, string2.length()-1);

        Log.d(TAG, "length is: " + string2.length());

        Log.d(TAG, subString2);
        Log.d(TAG, subString3);
        Log.d(TAG, subString4);

        AccessModifiers modifiers = new AccessModifiers();
        modifiers.a = 5;  // a, c, and d, are accessible... but not "b" because it is set to private.
        modifiers.getB() ;  // b can be accessed through the private method.



        ReverseString reverser = new ReverseString();

        String reversed = reverser.reverseString(string1);

        Log.d(TAG, "reversed main is: " + reversed);

        RemoveJunkFromString remover = new RemoveJunkFromString();

        Log.d(TAG, "remove junk: " + remover.removeJunk(string2));

        Log.d(TAG, "remove junk not dot: " + remover.removeJunkNotDot(string2));

        Log.d(TAG, "myInt: " + myInt);
        Log.d(TAG, "reverse myInt: " + ReverseInteger.reverseInt(myInt));



        int numberOfPeopleInRoom = 3;

        TotalHandshakesInRoom totalShakes = new TotalHandshakesInRoom();

        int handshakes = totalShakes.howManyHandshakes(numberOfPeopleInRoom);

        Log.d(TAG, "Number of people in room: " + numberOfPeopleInRoom);
        Log.d(TAG, "Number of handshakes in room: " + handshakes);

        numberOfPeopleInRoom = 5;
        handshakes = totalShakes.howManyHandshakes(numberOfPeopleInRoom);

        Log.d(TAG, "Number of people in room: " + numberOfPeopleInRoom);
        Log.d(TAG, "Number of handshakes in room: " + handshakes);

        numberOfPeopleInRoom = 10;
        handshakes = totalShakes.howManyHandshakes(numberOfPeopleInRoom);

        Log.d(TAG, "Number of people in room: " + numberOfPeopleInRoom);
        Log.d(TAG, "Number of handshakes in room: " + handshakes);

        numberOfPeopleInRoom = 0;
        handshakes = totalShakes.howManyHandshakes(numberOfPeopleInRoom);

        Log.d(TAG, "Number of people in room: " + numberOfPeopleInRoom);
        Log.d(TAG, "Number of handshakes in room: " + handshakes);

        numberOfPeopleInRoom = -3;
        handshakes = totalShakes.howManyHandshakes(numberOfPeopleInRoom);

        Log.d(TAG, "Number of people in room: " + numberOfPeopleInRoom);
        Log.d(TAG, "Number of handshakes in room: " + handshakes);

        ArrayFindMissingNumber newTest = new ArrayFindMissingNumber();

        newTest.printArray();
        newTest.printArray2();
        newTest.printRandomArraySize(18);

        FindDuplicateStringsInArray duplicateTest = new FindDuplicateStringsInArray();
        duplicateTest.anyDuplicates(new String[] {"apple, george, news, sad, glory, sad, george", "apple", "sad", "apple"});
        duplicateTest.anyDuplicates(new String[] {"1", "2", "3", "2", "3"});
        duplicateTest.anyDuplicatesUsingHashSet(new String[] {"test", "testing", "testing my butt", "testing"});

        ReverseWordOrderNotPunctuation reverser2 = new ReverseWordOrderNotPunctuation();
        String reversedString = reverser2.reversedOrder("I live here now.  Can you believe it?");

        Log.d(TAG, "reversed string: " + reversedString);

        ArraySumInGivenWindow.sumOfNumbersInUnEndingArray(3,5);
        ArraySumInGivenWindow.sumOfNumbersInUnEndingArray(1,10);
        ArraySumInGivenWindow.sumOfNumbersInUnEndingArray(0,3);

        IsThisPalindrome.isPalindrome("apple stinks");
        IsThisPalindrome.isPalindrome("abcdcba");

        Log.d(TAG, "fibonacci array, number 5 is: " + FibonacciSequenceWithArray.fibonacciNumberIs(8));

        int num = 0;
        Log.d(TAG, "fibonacci recursive " + num + " " + FibonacciRecursive.returnThisNumberOfTheSequence(num));
         num = 1;
        Log.d(TAG, "fibonacci recursive " + num + " " + FibonacciRecursive.returnThisNumberOfTheSequence(num));
         num = 2;
        Log.d(TAG, "fibonacci recursive " + num + " " + FibonacciRecursive.returnThisNumberOfTheSequence(num));
         num = 3;
        Log.d(TAG, "fibonacci recursive " + num + " " + FibonacciRecursive.returnThisNumberOfTheSequence(num));
         num = 4;
        Log.d(TAG, "fibonacci recursive " + num + " " + FibonacciRecursive.returnThisNumberOfTheSequence(num));
        num = 5;
        Log.d(TAG, "fibonacci recursive " + num + " " + FibonacciRecursive.returnThisNumberOfTheSequence(num));
        num = 6;
        Log.d(TAG, "fibonacci recursive " + num + " " + FibonacciRecursive.returnThisNumberOfTheSequence(num));


      //  System.out.println("fibonacci, number 5 is: " + FibonacciSequenceWithArray.fibonacciNumberIs(5));

        Log.d(TAG, "recursion example, adding all previous integers: " + RecursiveExample.addPrevious(3));
        Log.d(TAG, "recursion example, adding all previous integers: " + RecursiveExample.addPrevious(4));

        Log.d(TAG, "yes there is a change.");




    }
}
