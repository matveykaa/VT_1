package laba1;

import java.util.ArrayList;

public class Basket {
    private final ArrayList<Ball> balls = new ArrayList<Ball>();

    public void addBall(int weight, Color color)
    {
        balls.add(new Ball(weight, color));
    }

    public int getWeight()
    {
        int totalWeight = 0;
        for (Ball ball : balls) {
            totalWeight += ball.getWeight();
        }
        return totalWeight;
    }

    public int getNumBalls(Color color) {
        int totalBalls = 0;
        for (Ball ball : balls) {
            if (ball.getColor() == color)
                totalBalls++;
        }
        return totalBalls;
    }
}
