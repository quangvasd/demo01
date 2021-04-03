package vn.plusplus.threading.Ex3;

public class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            double randomDouble = Math.random();
            randomDouble = randomDouble * 10000;
            int randomInt = (int) randomDouble;
            System.out.println("Random number is : " + randomInt);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
        }

    }
}
