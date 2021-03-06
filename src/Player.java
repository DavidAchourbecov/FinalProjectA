import java.awt.*;

public class Player implements Paintable {
    private int x;
    private int y;
    private int width;
    private int height;
    private final int speed;
    public Player(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed=Constants.PLAYER_SPEED;
    }

    public int getSpeed() {
        return speed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void paint(Graphics graphics) {
        graphics.setColor(Color.WHITE);
        graphics.fillOval(this.getX(), this.getY(), this.getWidth(), this.getHeight());

    }

    @Override
    public void move(int direction) {
        switch (direction) {
            case Constants.MOVE_RIGHT:
               this.x+=this.speed;

                break;
            case Constants.MOVE_LEFT:
                this.x-=this.speed;

                break;
            case Constants.MOVE_UP:
                this.y-=this.speed;

                break;
            case Constants.MOVE_DOWN:
                this.y+=this.speed;

                break;
        }
    }


}
