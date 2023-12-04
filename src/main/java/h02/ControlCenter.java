package h02;

import fopbot.Direction;
import fopbot.Robot;
import fopbot.World;
import org.jetbrains.annotations.NotNull;

import static org.tudalgo.algoutils.student.Student.crash;

/**
 * A class that controls the {@linkplain Robot robots} and their actions.
 */
public class ControlCenter {

    private java.lang.Object Math;

    /**
     * Creates a new line of {@linkplain ScanRobot ScanRobots}.
     *
     * @return An array containing the newly initialised robots
     */
    public ScanRobot[] initScanRobots() {
        // TODO: H1.1
        // erstellt einem Array mit dem korrekten Größe
        final ScanRobot[] scanRobots = new ScanRobot[World.getWidth() - 1];
        // den Array füllen
        for (int i = 0; i < World.getWidth() - 1; i++){
            scanRobots[i] = new ScanRobot(i+1, 0, Direction.UP, 0);
        }
        return scanRobots;
    }

    /**
     * Creates a new line of {@linkplain CleanRobot CleanRobots}.
     *
     * @return An array containing the newly initialised robots
     */
    public CleanRobot[] initCleaningRobots() {
        // TODO: H1.2
        // erstellt einem Array mit dem korrekten Größe
        final CleanRobot[] cleanRobots = new CleanRobot[World.getHeight() - 1];
        // den Array füllen
        for (int i = 0; i < World.getHeight() - 1; i++){
            cleanRobots[i] = new CleanRobot(0, i+1, Direction.RIGHT, 0);
        }
        return cleanRobots;
    }

    /**
     * Inverts the given array by swapping the first and last entry, continuing with the second and second last entry and so on until the entire array has been inverted.
     *
     * @param robots The array to invert
     */
    public void reverseRobots(Robot[] robots) {
        // TODO: H3.1
        for (int i = robots.length; i > robots.length - 1; i++){
            // Hier wird die Postitionen der Roboter gewechselt
            final Robot tmp = robots[i - 1];
            robots[i - 1] = robots[robots.length - i];
            robots[robots.length - i] = tmp;

        }
        crash("H3.1 - remove if implemented");
    }

    /**
     * Rotates the {@linkplain Robot robots} in the given array in ascending order and calls {@link #checkForDamage} on every {@link Robot} after its rotation.
     * @param robots The array of {@linkplain Robot robots} to rotate
     */
    public void rotateRobots(final Robot @NotNull [] robots) {
        // TODO: H3.2
        for(final Robot robot : robots) {
            robot.turnLeft();
            robot.turnLeft();
            checkForDamage(robot);
        }
        crash("H3.2 - remove if implemented");
    }

    /**
     * Simulates inspecting a {@link Robot} for wear, turning it off if it should no longer serve. Currently implemented as a coin flip.
     *
     * @param robot The {@link Robot} to inspect
     */
    public void checkForDamage(Robot robot) {
        final double p = 0.5;
        if (Math.random() > p) {
            robot.turnOff();
        }
    }

    /**
     * Replaces the {@linkplain Robot robots} that are turned off in the provided array with new ones. <br>
     * The method expects either an array of {@linkplain ScanRobot ScanRobots} or {@linkplain CleanRobot CleanRobots} and uses the correct class when replacing the robots.
     *
     * @param robots An array possibly containing {@linkplain Robot robots} that are turned off and need to be replaced
     */
    public void replaceBrokenRobots(Robot[] robots) {
        // TODO: H3.3
        for (int i = 0; i < robots.length; i++){
            if(robots[i].isTurnedOff()){
                // alle wichtige Attributen speichern
                final int x = robots[i].getX();
                final int y = robots[i].getY();
                final int numberOfCoins = robots[i].getNumberOfCoins();
                final Direction direction = robots[i].getDirection();
                // einen neuen Roboter mit den vergangenen gespeicherten Attributen erstellen
                if (isScanRobotArray(robots)){
                    robots[i] = new ScanRobot(x, y, direction, numberOfCoins);
                } else {
                    robots[i] = new CleanRobot(x, y, direction, numberOfCoins);
                }
            }
        }
        crash("H3.3 - remove if implemented");
    }

    /**
     * Tests whether the given array is an array of {@linkplain ScanRobot ScanRobots} or not.
     *
     * @param robots The array to test
     * @return Whether the given array is an array of {@linkplain ScanRobot ScanRobots}
     */
    public boolean isScanRobotArray(Robot[] robots) {
        return robots instanceof ScanRobot[];
    }

    /**
     * Calls {@link #reverseRobots}, {@link #rotateRobots} and {@link #replaceBrokenRobots} in that order, with the given array as the argument
     *
     * @param robots The array to perform the aforementioned actions on
     */
    public void spinRobots(Robot[] robots) {
        // TODO: H3.4
        reverseRobots(robots);
        rotateRobots(robots);
        replaceBrokenRobots(robots);
        crash("H3.4 - remove if implemented");
    }

    /**
     * Moves the robots to the end of the world, in ascending order and one at a time.
     *
     * @param robots The robots to move
     */
    public void returnRobots(Robot[] robots) {
        // TODO: H4.1
        crash("H4.1 - remove if implemented");
    }

    /**
     * Scans the world using the provided {@linkplain ScanRobot ScanRobots} and returns an array containing the scan results.
     *
     * @param scanRobots The robots to scan the world with
     * @return An array detailing which world fields contain at least one coin
     */
    public boolean[][] scanWorld(ScanRobot[] scanRobots) {
        // TODO: H4.2
        return crash("H4.2 - remove if implemented");
    }

    /**
     * Performs one iteration of collecting coins, using the provided arrays to clean and determine where to clean.
     *
     * @param coinPositions An array with all the coin positions to be collected
     * @param cleanRobots   An array containing the {@linkplain CleanRobot CleanRobots} to collect the coins with.
     */
    public void moveCleanRobots(CleanRobot[] cleanRobots, boolean[][] coinPositions) {
        // TODO: H4.3
        crash("H4.3 - remove if implemented");
    }

    /**
     * Collects all the coins in the world using all the previously implemented helper methods.
     */
    public void cleanWorld() {
        ScanRobot[] scanRobots = initScanRobots();
        CleanRobot[] cleanRobots = initCleaningRobots();
        boolean coinsGathered = false;
        while (!coinsGathered) {
            boolean[][] coinsInWorld = scanWorld(scanRobots);
            if (allCoinsGathered(coinsInWorld)) {
                break;
            }
            moveCleanRobots(cleanRobots, coinsInWorld);
            coinsGathered = allCoinsGathered(coinsInWorld);
        }
        System.out.println("Finished cleaning the world!");
    }

    /**
     * Returns whether there are no coins left in the world.
     *
     * @param coins The array to search for coins
     * @return Whether the provided array contains at least one entry that is not false
     */
    public boolean allCoinsGathered(boolean[][] coins) {
        for (boolean[] coinRow : coins) {
            for (boolean b : coinRow) {
                if (b) {
                    return false;
                }
            }
        }
        return true;
    }
}
