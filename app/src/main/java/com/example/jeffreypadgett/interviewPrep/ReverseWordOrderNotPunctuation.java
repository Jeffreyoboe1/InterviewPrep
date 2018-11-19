package com.example.jeffreypadgett.interviewPrep;

import java.util.ArrayList;

public class ReverseWordOrderNotPunctuation {

    // reverse order of words, but not their punctuation.

    public String reversedOrder (String string) {


       String[] asArray =  string.split(" ");
       String newString = "";

       for (int i = asArray.length-1; i >= 0; i--) {

           newString = newString + asArray[i] + " ";



       }

       ArrayList<String> list = new ArrayList<String>();

       newString = newString.trim();
       return newString;
    }
}

// making changes here as well.
