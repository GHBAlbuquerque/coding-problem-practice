## Problem: Matrix Command Executor

You are given a 2D matrix of integers and a list of commands to manipulate the matrix. Each command alters the matrix in some way — either by swapping, reversing, or rotating rows or columns.

Write a function:
```int[][] solution(int[][] matrix, String[] commands)```

Where:
•	matrix is a non-empty 2D matrix of integers (size N x M).
•	commands is a list of strings where each string represents a command to execute.

Return the final state of the matrix after all commands have been executed.

⸻

❖ Possible Commands

Each command is one of the following:
1.	“swapRows x y”
Swap row x with row y (0-based indices).
2.	“swapColumns x y”
Swap column x with column y (0-based indices).
3.	“reverseRow x”
Reverse all elements in row x.
4.	“reverseColumn x”
Reverse all elements in column x.
5.	“flipMatrix180”
Rotate the entire matrix by 180 degrees (i.e., flip both horizontally and vertically).

Example:

```
int[][] matrix = {
  {1, 2, 3},
  {4, 5, 6},
  {7, 8, 9}
};

String[] commands = {
  "swapRows 0 2",
  "swapColumns 0 2",
  "reverseRow 1",
  "flipMatrix180"
};
```

Output:

```
int[][] output = {
  {4, 5, 6},
  {9, 8, 7},
  {3, 2, 1}
};
```