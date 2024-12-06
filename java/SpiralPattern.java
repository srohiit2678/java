public class SpiralPattern {
    public static void main(String[] args) {
        int n = 5; // Size of the spiral (n x n)
        int num = 1; // Starting number

        // Define boundaries
        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        // Use nested loops to fill the spiral pattern
        int[][] grid = new int[n][n]; // Create a 2D array to store the values dynamically

        // Loop until the spiral is completely filled
        while (top <= bottom && left <= right) {
            // Fill the top row
            for (int i = left; i <= right; i++) {
                grid[top][i] = num++;
            }
            top++;

            // Fill the right column
            for (int i = top; i <= bottom; i++) {
                grid[i][right] = num++;
            }
            right--;

            // Fill the bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    grid[bottom][i] = num++;
                }
                bottom--;
            }

            // Fill the left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    grid[i][left] = num++;
                }
                left++;
            }
        }

        // Print the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d ", grid[i][j]);
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}


/*
            "5"                     "3"                  "4"
     1  2   3   4   5           1   2   3          1    2   3   4 
    16  17  18  19  6           8   9   4          12   13  14  5
    15  24  25  20  7           7   6   5          11   16  15  6
    14  23  22  21  8                              10    9  8   7 
    13  12  11  10  9
  


  
  
  
  
 */