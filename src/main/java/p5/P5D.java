package p5;

public class P5D {
    public static void main(String[] args) {

        char[][] grid = new char[6][5];

        char nextChar = 'a';
        for(int row = 0; row < grid.length; row++ ) {
            for( int col = 0; col < grid[0].length; col++) {
                grid[row][col] = nextChar;
                if(nextChar == 'z') {
                    nextChar = 'a';
                } else {
                    nextChar++;
                }
            }
        }

        for(int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col ++) {
                System.out.print(grid[row][col] + " ");
            }
            System.out.print("\n");
        }


    }
}
