package com.example.jeffreypadgett.interviewPrep;

public class RecursiveExample {




        public static int addPrevious(int x) {

            if (x == 0) {
                return 0;
            }
            return x + (addPrevious(x-1));

        }





}
