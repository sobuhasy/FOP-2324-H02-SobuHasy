package h02;

import fopbot.Direction;
import fopbot.Robot;
import fopbot.RobotFamily;

/**
 * A {@link Robot} that is unable to detect whether it is on a coin or not.
 */
public class CleanRobot extends Robot {
    /**
     * Creates a new {@link CleanRobot} with the given parameters.
     *
     * @param x             The x coordinate of the {@link CleanRobot}
     * @param y             The y coordinate of the {@link CleanRobot}
     * @param direction     The {@link Direction} the {@link CleanRobot} is facing
     * @param numberOfCoins The number of coins the {@link CleanRobot} is holding
     */
    public CleanRobot(int x, int y, Direction direction, int numberOfCoins) {
        super(x, y, direction, numberOfCoins, RobotFamily.SQUARE_BLACK);
    }

    @Override
    public boolean isOnACoin() {
        throw new UnsupportedOperationException("This robot is unable check for coins!");
    }

    @Override
    public String toString() {
        return "CleanRobot{"
            + "id='" + getId() + '\''
            + ", at=[" + getX() + '/' + getY()
            + "], numberOfCoins=" + getNumberOfCoins()
            + ", direction=" + getDirection()
            + '}';
    }
}
