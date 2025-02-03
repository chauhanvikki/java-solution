// import java.util.Scanner;

// public class Solution {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         // Read the board
//         char[][] board = new char[9][9];
//         System.out.println("Enter the Sudoku board (use '.' for empty cells):");
//         for (int i = 0; i < 9; i++) {
//             String line = scanner.nextLine();
//             for (int j = 0; j < 9; j++) {
//                 board[i][j] = line.charAt(j);
//             }
//         }
        
//         // Solve the Sudoku
//         Solution solution = new Solution();
//         solution.solveSudoku(board);
        
//         // Print the solved Sudoku
//         System.out.println("Solved Sudoku:");
//         for (int i = 0; i < 9; i++) {
//             for (int j = 0; j < 9; j++) {
//                 System.out.print(board[i][j] + " ");
//             }
//             System.out.println();
//         }
        
//         scanner.close();
//     }

//     public void solveSudoku(char[][] board) {
//         solve(board);
//     }

//     private boolean solve(char[][] board) {
//         int n = board.length;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (board[i][j] == '.') {
//                     for (char c = '1'; c <= '9'; c++) {
//                         if (isValid(board, i, j, c)) {
//                             board[i][j] = c;
//                             if (solve(board)) {
//                                 return true;
//                             } else {
//                                 board[i][j] = '.'; // Backtrack
//                             }
//                         }
//                     }
//                     return false; // Trigger backtracking
//                 }
//             }
//         }
//         return true;
//     }

//     private boolean isValid(char[][] board, int row, int col, char c) {
//         for (int i = 0; i < 9; i++) {
//             if (board[i][col] == c || board[row][i] == c ||
//                 board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }



// import java.util.*;
class Solution {
  public int removeDuplicates(int[] nums) {
      int j=1;
       for(int i=1;i<nums.length;i++){
      

          
          if(nums[i]!=nums[j-1]){
              nums[j]=nums[i];
              j++;
          }
          
          }
          return j;
       }
      
  }


              