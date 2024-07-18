interface Movable {



    void moveUp();

    void moveDown();

    void moveLeft();

    void moveRight();

}



class MovablePoint implements Movable {



    private int x;

    private int y;

    private int xSpeed;

    private int ySpeed;



    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {

        this.x = x;

        this.y = y;

        this.xSpeed = xSpeed;

        this.ySpeed = ySpeed;

    }



    @Override



    public void moveUp() {



        y += ySpeed;



    }







    @Override

    public void moveDown() {

        y -= ySpeed;

    }



    @Override

    public void moveLeft() {

        x -= xSpeed;

    }



    @Override

    public void moveRight() {

        x += xSpeed;

    }



    @Override

    public String toString() {

        return "MovablePoint Speed = (" + x + ", " + y + ")";

    }

}



class MovableCircle implements Movable {	



    private MovablePoint center; 

    private int radius;



    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {

        this.center = new MovablePoint(x, y, xSpeed, ySpeed);

        this.radius = radius;

    }



    @Override

    public void moveUp() {

        center.moveUp();

    }



    @Override

    public void moveDown() {

        center.moveDown();

    }



    @Override

    public void moveLeft() {

        center.moveLeft();

    }



    @Override

    public void moveRight() {

        center.moveRight();

    }



    @Override

    public String toString() {

        return "MovableCircle with center at " + center + " and radius " + radius;

    }

}



public class MethodOverride {



	public static void main(String[] args) {



        MovablePoint point = new MovablePoint(0, 0, 1, 1);

        point.moveUp();

        System.out.println(point);



        MovableCircle circle = new MovableCircle(0, 0, 1, 1, 5);

        circle.moveRight();

        System.out.println(circle); 



    }

}