package h02;

import fopbot.Direction;
import fopbot.Robot;
import fopbot.RobotFamily;

/**
 * A {@link Robot} that is unable to pick up coins.
 */
public class ScanRobot extends Robot {
    /**
     * Creates a new {@link ScanRobot} with the given parameters.
     *
     * @param x             the x coordinate of the {@link ScanRobot}
     * @param y             the y coordinate of the {@link ScanRobot}
     * @param direction     the {@link Direction} the {@link ScanRobot} is facing
     * @param numberOfCoins the number of coins the {@link ScanRobot} is holding
     */
    public ScanRobot(int x, int y, Direction direction, int numberOfCoins) {
        super(x, y, direction, numberOfCoins, RobotFamily.SQUARE_RED);
    }

    @Override
    public void pickCoin() {
        throw new UnsupportedOperationException("This robot is unable to pick up coins!");
    }

    @Override
    public String toString() {
        return "ScanRobot{"
            + "id='" + getId() + '\''
            + ", at=[" + getX() + '/' + getY()
            + "], numberOfCoins=" + getNumberOfCoins()
            + ", direction=" + getDirection()
            + '}';
    }
}
