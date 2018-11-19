package com.example.jeffreypadgett.interviewPrep;

public class RemoveJunkFromString {

    String removeJunk (String stringWithJunk) {

        return stringWithJunk.replaceAll("[^a-zA-Z0-9]", "");



    }

    // or do a loop for each character in the string... annoying.


    String removeJunkNotDot (String string) {
        return string.replaceAll("[^a-zA-Z0-9.]", "");

    }



}
