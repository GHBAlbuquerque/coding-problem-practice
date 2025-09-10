package com.easy._26createNotification;

public class CreateNotification {
    class Solution {
        public String solution(String message, int K) {
            if(message.length() <= K) return message;

            StringBuilder notification = new StringBuilder();
            String[] words = message.split(" ");

            for(String word : words) {
                StringBuilder test = new StringBuilder(notification.toString()).append(word).append(" ...");

                if(test.length() <= K) {
                    notification.append(word).append(" ");
                } else {
                    notification.append("...");
                    break;
                }
            }

            if(notification.length() > 0 && notification.charAt(notification.length()-1) == ' ') {
                notification.deleteCharAt(notification.length()-1);
            }

            return notification.toString();
        }
    }
}
