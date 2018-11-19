package com.example.jeffreypadgett.interviewPrep;

import android.text.TextUtils;
import android.util.Log;

import java.util.HashSet;

public class FindDuplicateStringsInArray {

    String TAG = "FindDuplicateStringsInArray";

    public void anyDuplicates (String[] array) {

        for (int i = 0; i < array.length; i++) {

            String s1 = array[i];

            for (int j = i + 1; j <array.length; j ++) {

                String s2 = array[j];
                if (TextUtils.equals(s1, s2)) {

                    Log.d(TAG, "duplicate found: " + s2);
                }
            }


        }

        // or you can do
// I am making changes here and now.
// commit add m

    }

    public void anyDuplicatesUsingHashSet (String[] array) {

        HashSet<String> set = new HashSet<String>();

        for (String arrayElement : array)
        {
            if(!set.add(arrayElement))  // adds an element to the hashset, returns True if it is added, false if it already exists.
            {
                Log.d(TAG, "Duplicate Element is : "+arrayElement);
            }
        }
    }



}
