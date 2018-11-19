package com.example.jeffreypadgett.interviewPrep;

import android.util.Log;

public class ReverseString {


    String TAG = "ReverseString";

    String s;


    public String getS(String s) {

        return s;


    }

    public void setS(String s) {
        this.s = s;
    }

    String reverseString(String s) {

        if (s == null || s.isEmpty()) {
            Log.d(TAG, "string was empty.");
            return null;
        }

        int length = s.length();
        String reversed = "";

        for (int i = length - 1; i >=0; i--) {
            char letter = s.charAt(i);

            reversed = reversed + letter;

        }

        Log.d(TAG, "reversed string is: " + reversed);

        return reversed;



    }












}
