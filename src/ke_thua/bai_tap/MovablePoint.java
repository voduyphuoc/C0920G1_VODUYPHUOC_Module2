package ke_thua.bai_tap;

public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;
    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(){}
    public float getXSpeed(){
        return xSpeed;
    }
    public void setXSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }
    public float getYSpeed(){
        return ySpeed;
    }
    public  void setYSpeed(float ySpeed){
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{this.xSpeed, this.ySpeed};
    }
    @Override
    public String toString(){
        return "MovablePoint{" +
                "x = " + getX() +
                ",y  = " + getY() +
                ", xSpeed = " + xSpeed +
                ", ySpeed = " + ySpeed +
                '}';
    }
    public MovablePoint move(){
        float x = getX();
        float y = getY();
        setX(x += xSpeed);
        setY(y += ySpeed);
        return this;
    }

    public static void main(String[] args) {
        Point point = new Point(1,2);
        System.out.println(point.toString());
        System.out.println("After: ");
        MovablePoint movablePoint = new MovablePoint(1,2,3,4);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println("Before :");
        System.out.println(movablePoint);
    }
}
