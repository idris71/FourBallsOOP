public class Ball {
    private static FourBalls mainObject;
    private static int diameter;

    private final int velocity;
    private final float startY;
    private int init;

    public Ball(int velocity, float startY) {
        this.velocity = velocity;
        this.startY = startY;
        this.init=0;
    }

    public static void setMainObject(FourBalls obj) {
        Ball.mainObject = obj;
    }

    public static void setDiameter(int diameter) { Ball.diameter = diameter; }

    public void advance() {
        mainObject.ellipse(init,startY,diameter,diameter);
        init+=velocity;
    }
}