public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setOn(false);
        fan2.setColor("Blue");
        fan2.setRadius(5);
        System.out.println(fan2.toString());;

    }
}