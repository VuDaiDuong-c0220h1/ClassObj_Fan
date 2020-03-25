public class Fan {
    public static final int slow = 1, medium = 2, fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan(){
    }

    public String toString() {
        if (this.on) {
            return "Fan is on. Speed: " + this.speed + " Color: " + this.color + " Radius: " + this.radius;
        } else {
            return "Fan is off. Color: " + this.color + " Radius: " + this.radius;
        }
    }
}
