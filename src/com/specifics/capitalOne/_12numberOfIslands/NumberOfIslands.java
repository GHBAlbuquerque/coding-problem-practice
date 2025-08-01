package com.specifics.capitalOne._12numberOfIslands;/*
grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
an array of arrays

4. High-level idea to solve
	•	You’ll scan every cell in the grid.
	•	When you find a '1' (land), you have found an unvisited island.
	•	You start exploring that island to mark all connected land as visited.
	•	You increment your island count.
	•	Keep scanning until all cells have been checked.
 */

public class NumberOfIslands {
    public static void isIsland(char[][] grid, int i, int j) {
        if(i < 0 || j <0 ) return; // out of bonds
        if(i >= grid.length || j >= grid[i].length) return; //out of bonds
        if(grid[i][j] == '0') return; //is not land, has to be check because of recursiviness;

        grid[i][j] = '0'; // mark as visited

        //check all neighbors
        isIsland(grid, i+1, j);
        isIsland(grid, i-1, j);
        isIsland(grid, i, j+1);
        isIsland(grid, i, j-1);
    }


    public static int numIslands(char[][] grid) {
        int islands = 0;

        //itweate over the outer array
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[i].length; j++) { //iterate over the inner array
                if(grid[i][j] == '1') { //if it is an island (1), then add to island and check connected islands
                    islands++;
                    isIsland(grid, i, j);
                }

            }
        }

        return islands;
    }

    public static void main(String[] args) {
        char[][] grid = new char[][]{{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};

        System.out.println(com.medium._03numberOfIslands.NumberOfIslands.numIslands(grid));
    }
}