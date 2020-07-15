package vvkuznetsov.java.oop;

import java.util.Random;

public class Less1 {
    public static void main(String[] args) {

        Random rand = new Random();
        Actions[] actions = new Actions[3];

        int distance = rand.nextInt(5);
        int heigth = rand.nextInt(5);
        actions[0] = new Human("Oleg", distance, heigth);

        distance = rand.nextInt(5);
        heigth = rand.nextInt(5);
        actions[1] = new Robot("Chappie", distance, heigth);

        distance = rand.nextInt(5);
        heigth = rand.nextInt(5);
        actions[2] = new Cat("Murka", distance, heigth);

        Barrier[] barriers = new Barrier[6];

        boolean isRoad;
        for (int i = 0; i < barriers.length; i++) {
            distance = rand.nextInt(5);
            isRoad = rand.nextBoolean();
            if (isRoad) {
                barriers[i] = new RunningTrack("Road " + i, distance);
            } else {
                barriers[i] = new Wall("Wall " + i, distance);
            }
        }

        for (int i = 0; i < actions.length; i++) {
            boolean result = true;
            for (int j = 0; j < barriers.length; j++) {

                result = barriers[j].moving(actions[i]);

                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Success!");
            } else {
                System.out.println("Unsuccessfully!");
            }
        }
    }
}
