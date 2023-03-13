public abstract class Vehicle {
    private int wheels;
    private String body;
    protected int lights;
    private String speed;

    public Vehicle(int wheels, String body, int lights, String speed) {
        this.wheels = wheels;
        this.body = body;
        this.lights = lights;
        this.speed = speed;
    }

    public abstract void drive(String speed);
    public abstract void stop();
}
