package com.example.jeffreypadgett.interviewPrep;

public class TotalHandshakesInRoom {

    public int howManyHandshakes(int numberOfPeopleInRoom) {

        int numberOfHandshakes = 0 ;

        /* 1, 0 handshakes
        2, 1 handshakes
        3, 2 + 1 = 3 handshakes
        4, 3, + 2, + 1 = 6
        5, 1(4), (2)3, 3(2), 4(1), 5(0) = 10...

        * */



                // loop

        if (numberOfPeopleInRoom > 0) {


            for (int i = numberOfPeopleInRoom; i > 0 ; i--) {  //TODO:  change the i > 0, check

                numberOfHandshakes = numberOfHandshakes + i - 1;  // if 5, then this would be 0 + 4

                // -- =
            }
            return numberOfHandshakes;

        }

// 5, nHS = 4
//        4, nHS = 7
//        3, nHS = 9
//        2, nHS = 10
//        1, nHS = 10  ... then i = 0... will not run again...

        return numberOfHandshakes;
    }
}
