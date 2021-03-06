package vvkuznetsov.java.oop;

public class Cat implements Actions {
    private String name;
    private int runningDistance;
    private int jumpHeight;

    public Cat(String name, int distance, int jumpHeight) {
        this.name = name;
        this.runningDistance = distance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.println("Cat " + this.name + " is running " + this.getRunningDistance());
    }

    @Override
    public void jump() {
        System.out.println("Cat " + this.name + " is jumping " + this.getJumpHeight());
    }

    @Override
    public int getRunningDistance() {
        return this.runningDistance;
    }

    @Override
    public int getJumpHeight() {
        return this.jumpHeight;
    }
}
