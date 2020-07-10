package vvkuznetsov.java.oop;

public class runningTrack extends Barrier {
    private int length;

    public runningTrack(String name, int length) {
        super(name);

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println("The road " + super.getName() + " length: "+ " " + this.length);

        actions.run();

        if (getLength() <= actions.getRunningDistance()) {
            System.out.println("Run success");

            return true;
        } else {
            System.out.println("Run unsuccessfully");

            return false;
        }
    }
}
