class N_Queen_Solution_One {
    public static void main(String[] args) {
        int n = 5; 
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        nQueen(board, 0);
    }

    public static void print(char[][] board) {
        int n = board.length; 
        System.out.println("---------------------------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
            System.out.println();
        }
    }

    public static boolean nQueen(char[][] board, int row) {
        if (row == board.length) {
            print(board);
            return true;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if(nQueen(board, row + 1))
                {
                    return true;
                }
                board[row][j] = 'X';
            }
        }
        return false;
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        // for vertical
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q')
                return false;
        }

        // for diagonal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        // for diagonal right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }
}
