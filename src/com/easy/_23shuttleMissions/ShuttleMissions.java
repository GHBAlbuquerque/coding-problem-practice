package com.easy._23shuttleMissions;

public class ShuttleMissions {

    public static int solution(int[] alpha2beta, int[] beta2alpha, int missions) {
        int time =0;
        int a2bindex = 0;
        int b2aindex = 0;

        for (int m =0; m < missions; m++) {
            // ---- Alpha -> Beta ----
            while(a2bindex < alpha2beta.length && alpha2beta[a2bindex] < time) {
                // need to increment while i don't find a timeslot I can take
                a2bindex++;
            }
            time = alpha2beta[a2bindex];

            // ---- Beta -> Alpha ----
            while(b2aindex < beta2alpha.length && beta2alpha[b2aindex] < time) {
                // need to increment while i don't find a timeslot I can take
                b2aindex++;
            }
            time = beta2alpha[b2aindex];
        }

        return time;
    }

}
