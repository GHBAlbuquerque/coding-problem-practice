🪑 Problem Summary – Seat Reservation System

A movie theater has N seats numbered 1 to N
Build a seat reservation system that performs one of the following operations K times:
• Fetches the smallest-numbered unreserved seat then reserves it and returns its number.
• Cancels a seat reservation for seat 2

The result should be an array containing the reserved seat numbers.

```
int[] solution(int N, int K, int[] seatOps)
```

You are given:
•	N → total seats, numbered from 1 to N.
•	K → number of operations.
•	int[] seatOps → array of length K:
•	If seatOps[i] == 0, reserve the smallest unreserved seat (i.e. the lowest index with a 0).
•	If seatOps[i] > 0, cancel the reservation for the seat with that number.

You must return an int[] of length equal to the number of reservation operations, i.e., 
count of seatOps[i] == 0, storing the seat numbers that got reserved in the order they were reserved.

Example

Given:
```
N = 5
seatOps = [0, 0, 3, 0]


•	Initially: all seats are available → [0, 0, 0, 0, 0]
•	Step 1: 0 → reserve smallest (seat 1) → mark index 0 as 1
•	Step 2: 0 → reserve smallest (seat 2) → mark index 1 as 1
•	Step 3: 3 → cancel reservation of seat 3 → mark index 2 as 0
•	Step 4: 0 → reserve smallest (seat 3 again) → mark index 2 as 1

✅ Output: [1, 2, 3]
```

✅ So yes:
•	For 0: find first seat with value 0 (unreserved), set to 1, and record index+1 (since seats are 1-indexed).
•	For > 0: cancel reservation → set value at seatNumber - 1 back to 0.