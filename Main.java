import  java.util.Scanner;

public class Main{
  public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int[][] map = new int[6][6];
        int row;
        int column;
        int moveCount = 2;
        System.out.print("Enter row: ");
        row = scnr.nextInt()-1;
        System.out.print("Enter column: ");
        column = scnr.nextInt()-1;

        map[row][column] = 1;
        map = game(map, row, column, moveCount);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (map[i][j] < 10) {
                    System.out.print("|"+map[i][j] + " | ");
                }
                else {
                    System.out.print("|" + map[i][j] + "| ");
                }
            }
            System.out.println();
        }


    }
    public static int[][] game(int[][] map, int row, int column, int moveCount) {

        if (moveCount == 37) {
            return map;
        }
        int[] moveRow = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] moveColumn = {1, 2, 2, 1, -1, -2, -2, -1};

        int nextRow;
        int nextColumn;

        for (int i = 0; i < 8; i++) {
            nextRow = row + moveRow[i];
            nextColumn = column + moveColumn[i];
            if (check(map, nextRow, nextColumn)) {
                map[nextRow][nextColumn] = moveCount;
                int [][]finalMap = game(map, nextRow, nextColumn, moveCount + 1);
                    if (finalMap != null) {
                        return map;
                    }
                map[nextRow][nextColumn] = 0;
            }
        }
        return null;
    }

    public static boolean check(int[][] map, int row, int column) {
        if (row < 6 && column < 6 && row >= 0 && column >= 0 && map[row][column] == 0 ) {
            return true;
        }else{
        return false;
        }
    }
}

  
}
