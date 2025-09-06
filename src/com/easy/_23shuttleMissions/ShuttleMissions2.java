package com.easy._23shuttleMissions;

public class ShuttleMissions2 {

    public static int solution(int[] alpha2beta, int[] beta2alpha, int missions) {
        int time =0;
        int a2bindex = 0; // have to check each index separately
        int b2aindex = 0;

        // loop until all missions are done
        // each missions has one trip going and one coming back
        for (int m =0; m < missions; m++) {
            // ---- Alpha -> Beta ----
            while(a2bindex < alpha2beta.length && alpha2beta[a2bindex] < time) {
                // need to increment while i don't find a timeslot I can take
                a2bindex++;
            }
            time += alpha2beta[a2bindex]; // add going trip
            time += 100; //(add travel time)

            // ---- Beta -> Alpha ----
            while(b2aindex < beta2alpha.length && beta2alpha[b2aindex] < time) {
                // need to increment while i don't find a timeslot I can take
                b2aindex++;
            }
            time += beta2alpha[b2aindex]; // add coming back trip
        }

        return time;
    }

    public static void main(String[] args) {
        int result = solution(new int[]{0, 200, 500}, new int[]{99, 210, 450}, 1);
        System.out.println(result);
    }

}
