## Daily Coding Problem

You’re given a 2D matrix mat of size m x n.

Implement two operations:
1.	swapRows(mat, row1, row2) — swaps row row1 with row row2
2.	swapColumns(mat, col1, col2) — swaps column col1 with column col2

Write a function that, given the matrix and a list of swap operations (rows and/or columns), 
returns the matrix after all swaps are performed.

```
int[][] applySwaps(int[][] mat, List<SwapOperation> ops);
```
```
class SwapOperation {
String type; // "row" or "column"
int index1;
int index2;
}
```

Example:

```
Input:
mat = [
 [1, 2, 3],
 [4, 5, 6],
 [7, 8, 9]
]

ops = [
 SwapOperation("row", 0, 2),
 SwapOperation("column", 1, 2)
]

Output:
[
 [7, 9, 8],
 [4, 6, 5],
 [1, 3, 2]
]
```