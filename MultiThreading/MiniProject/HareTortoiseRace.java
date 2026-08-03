class Race extends Thread {
    private static boolean raceFinished = false;
    private boolean hareSleep;
    public Race(String name, boolean hareSleep) {
        super(name);
        this.hareSleep = hareSleep;
    }
    public static void resetRace() {
        raceFinished = false;
    }
    public void run() {
        for (int distance = 1; distance <= 100; distance++) {
            if (raceFinished) {
                return;
            }
            System.out.println(getName() + " covered " + distance + " meters");
            if (hareSleep && getName().equals("Hare") && distance == 60) {
                try {
                    System.out.println("Hare is sleeping for 1000 milliseconds...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (!raceFinished) {
            raceFinished = true;
            System.out.println("\n" + getName() + " wins the race!\n");
        }
    }
}
public class HareTortoiseRace {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("========== Part A ==========");
        Race.resetRace();
        Race hare1 = new Race("Hare", false);
        Race tortoise1 = new Race("Tortoise", false);
        hare1.start();
        tortoise1.start();
        hare1.join();
        tortoise1.join();
        System.out.println("========== Part B ==========");
        Race.resetRace();
        Race hare2 = new Race("Hare", false);
        Race tortoise2 = new Race("Tortoise", false);
        hare2.setPriority(Thread.MAX_PRIORITY);
        tortoise2.setPriority(Thread.MIN_PRIORITY);
        hare2.start();
        tortoise2.start();
        hare2.join();
        tortoise2.join();
        System.out.println("========== Part C ==========");
        Race.resetRace();
        Race hare3 = new Race("Hare", true);
        Race tortoise3 = new Race("Tortoise", false);
        hare3.setPriority(Thread.MAX_PRIORITY);
        tortoise3.setPriority(Thread.MIN_PRIORITY);
        hare3.start();
        tortoise3.start();
        hare3.join();
        tortoise3.join();
    }
}