package h02;

import fopbot.World;

import static org.tudalgo.algoutils.student.Student.crash;

/**
 * Main entry point in executing the program.
 */
public class Main {

    /**
     * Main entry point in executing the program.
     *
     * @param args program arguments, currently ignored
     */
    public static void main(String[] args) {
        // define world dimensions
        final int numberOfRows = 15;
        final int numberOfColumns = 16;
        // create an array for filling the world with some coins in a mysterious pattern
        final int[][] coins = new int[][]{
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 4, 4, 0, 0, 4, 4, 0, 1, 0, 0, 0},
            {0, 0, 1, 0, 4, 0, 0, 4, 4, 0, 0, 4, 0, 1, 0, 0},
            {0, 0, 1, 0, 4, 0, 0, 0, 0, 0, 0, 4, 0, 1, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0, 4, 0, 0, 0, 0, 4, 0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 2, 0, 0, 0, 3, 1, 1, 3, 0, 0, 0, 2, 0, 0},
            {0, 0, 0, 2, 0, 3, 0, 0, 0, 0, 3, 0, 2, 0, 0, 0},
            {0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        // // for a smaller example, simply uncomment the following code
        // numberOfRows = 6;
        // numberOfColumns = 11;
        // coins = new int[numberOfRows][numberOfColumns];
        // coins[4][7] = 1;
        // coins[1][8] = 1;
        // coins[2][9] = 2;

        // create a control center
        final ControlCenter controlCenter = new ControlCenter();
        // set the world dimensions
        World.setSize(numberOfColumns, numberOfRows);
        // don't draw turned off robots
        World.getGlobalWorld().setDrawTurnedOffRobots(false);
        // open world, set its delay and draw some decorations
        World.setVisible(true);
        World.setDelay(30); // adjust this value if the world runs too fast/slow for your liking
        World.placeBlock(0, 0);
        World.placeHorizontalWall(0, 0);
        World.placeVerticalWall(0, 0);
        // use the previously created array to fill the world with coins
        placeCoinsInWorld(coins);
        // let the robots clean up the mess
        controlCenter.cleanWorld();
    }

    /**
     * Places coins in the world according to the provided array
     *
     * @param coins An array detailing how many coins to place in what position
     */
    public static void placeCoinsInWorld(int[][] coins) {
        // H2
        for(int y = 0; y < coins.length; y++){
            for(int x = 0; x < coins[y].length; x++){
                if(coins[y][x] != 0){
                    World.putCoins(x, y, coins[y][x]);
                }
            }
        }
    }
}
