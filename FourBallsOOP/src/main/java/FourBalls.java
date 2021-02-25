import processing.core.PApplet;
public class FourBalls extends PApplet{
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 20;
    Ball balls[]=new Ball[4];

    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        Ball.setMainObject(this);
        Ball.setDiameter(DIAMETER);

        balls[0]=new Ball(1,HEIGHT/5);
        balls[1] =new Ball(2,HEIGHT*2/5);
        balls[2] =new Ball(3,HEIGHT*3/5);
        balls[3] =new Ball(4,HEIGHT*4/5);
    }

    @Override
    public void draw() {
        for(Ball ball:balls)
            ball.advance();
    }
}