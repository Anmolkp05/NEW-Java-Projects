import java.util.HashSet;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '8', '6', '3', '.', '.', '3'},
                {'4', '.', '3', '.', '.', '8', '3', '.', '1'},
                {'7', '.', '.', '2', '1', '9', '.', '5', '7'},
                {'9', '8', '.', '3', '5', '.', '6', '.', '.'},
                {'8', '5', '9', '.', '6', '2', '8', '1', '9'},
                {'.', '.', '5', '1', '3', '4', '2', '9', '.'}
        };

        Solution solution = new ValidSudoku().new Solution();
        boolean result = solution.isValidSudoku(board);
        System.out.println(result);

    }
    class Solution {
        public boolean isValidSudoku(char[][] board) {
            HashSet<String> set = new HashSet<>();

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (board[i][j] == '.') {
                        continue;
                    }
                    if(!set.add(board[i][j] + "in row" + i)){
                        return false;
                    }
                    if(!set.add(board[i][j] + "in col" + j)){
                        return false;
                    }
                    if(!set.add(board[i][j] + "in sb" + i/3 + j/3)){
                        return false;
                    }
                }
            }
            return true ;

        }
    }
}
