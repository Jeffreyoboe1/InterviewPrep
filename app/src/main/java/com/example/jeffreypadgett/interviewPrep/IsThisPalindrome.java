package com.example.jeffreypadgett.interviewPrep;

import android.util.Log;

public class IsThisPalindrome {
    static String TAG = "IsThisPalindrome";




    public static boolean isPalindrome (String string) {
        //Log.d(TAG, "whatup. palindrome");
        if (string == null || string.equals("")) {
            return true;
        }

        int length = string.length();
        // may need (), I can't remember.

        for (int i = 0; i<=0; i++) {

            if (string.charAt(i)!=(string.charAt(string.length()-1-i))) //  so, if length is 10, 0 = 9 index, 1 = 8 index
            {
               // Log.d(TAG, string + " is not a palindrome " + false);

                System.out.println(string + " is not a palindrome " + false);
                return false;}



            //"aba"
            //if i = 0,  then a, and 2, which is a
            // if i = 1, then b, and 1, which are both b
            // if i = 2, then a, and 3-1-2 = 0, a
            // what happens after midway point
            // what happens at the middle - center?

        }// TODO: fix the middle element - the range

       // Log.d(TAG, string + " is  a palindrome " + true);

        System.out.println(string + " is a palindrome " + true);
        return true;



    }

}
