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
        int numberOfRows = 6;
        int numberOfColumns = 11;
        int[][] coins = new int[numberOfRows][numberOfColumns];
        coins[4][7] = 1;
        coins[1][8] = 1;
        coins[2][9] = 2;

        ControlCenter controlCenter = new ControlCenter();

        World.setSize(numberOfColumns, numberOfRows);
        World.getGlobalWorld().setDrawTurnedOffRobots(false);
        World.setVisible(true);
        World.setDelay(10);
        World.placeBlock(0, 0);
        World.placeHorizontalWall(0, 0);
        World.placeVerticalWall(0, 0);

        placeCoinsInWorld(coins);
        controlCenter.cleanWorld();
    }

    /**
     * Places coins in the world according to the provided array
     *
     * @param coins An array detailing how many coins to place in what position
     */
    public static void placeCoinsInWorld(int[][] coins) {
        // TODO: H2
        crash("H2 - remove if implemented");
    }
}
