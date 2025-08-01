package com.medium._04seatReservationAndCancellation;

import java.util.*;

public class SeatReservationAndCancellation {

    static int[] solution(int N, int K, int[] seatOps) {
        // control the status of each seat
        int[] seatsStatus = new int[N];

        // count the number of reservation ops i might do, so i can initlize the result array
        int reservationCount = 0;
        for(int ops : seatOps) {
            if(ops == 0 ){
                reservationCount++;
            }
        }

        // initilize the result array
        int[] result = new int[reservationCount];
        int resultCount = 0;

        // iterate over the ops array
        for(int i=0; i<K;i++) {
            if(seatOps[i] == 0) {
                // iterate over my array of seatsStatus and find the smallest index with 0
                for (int j=0; j<N; j++) {
                    if(seatsStatus[j] == 0) {
                        seatsStatus[j] = 1; // take the [j] position in my seatsArray and turn to 1
                        result[resultCount] = j+1; // store index+1 in result
                        resultCount++;
                        break;
                    }
                }
            } else {
                // seats are 1 based, so i have to -1 from my ops value
                int seatNumber = seatOps[i]-1;
                // take the [ops-1] position in my seatsArray and turn to 0
                seatsStatus[seatNumber] = 0;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] result = SeatReservationAndCancellation.solution(5, 4, new int[] {0,0,3,0});
        System.out.println(Arrays.toString(result));
    }
}