package com.example.jeffreypadgett.interviewPrep;

import java.util.LinkedList;

public class ReverseSinglyLinkedList {



    LinkedList<String> reversedLinkedList(LinkedList<String> originalList) {

        if (originalList == null || originalList.isEmpty()) {

            LinkedList<String> newList = new LinkedList<>();
            newList.add("apple");
            newList.add("orange");
            newList.add("banana");
            newList.add("mango");
            newList.add("plum");
            newList.add("grapefruit");

            if (!newList.isEmpty() && !originalList.isEmpty()) {
                originalList.addAll(newList);

                newList.clear();
                newList = null;
            }

           //originalList.





        }








        return originalList;
    }


}
