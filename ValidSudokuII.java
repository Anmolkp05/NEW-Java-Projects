public class ValidSudokuII {
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

        ValidSudokuII validator = new ValidSudokuII();
        boolean result = validator.isValidSudoku(board);
        System.out.println(result);
}

        public boolean isValidSudoku(char[][] board) {
            for(int i = 0; i < 9; i++) {
                for(int j = 0; j < 9; j++) {
                    if(!isValid(i,j,board)){
                        return false;
                    }
                }
            }
            return true ;

        }
        private boolean isValid(int row , int col, char[][] board) {
            if(board[row][col]=='.') return true;

            for(int i = 0; i<9; i++) {
                if(col!=i && board[row][i]==board[row][col]) return false;
                if(row!=i && board[i][col]==board[row][col]) return false;
                if((3*(row/3)+i/3) != row && (3*(col/3)+i%3)!=col && board[3*(row/3)+i/3][3*(col/3)+i%3]==board[row][col]) return false;
            }
            return true;
        }
    }

