package owais;
class Racer extends Thread {
    private String name;
    private int sleepTime;

    public Racer(String name, int sleepTime) {
        this.name = name;
        this.sleepTime = sleepTime;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " is at step " + i);
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                System.out.println(name + " was interrupted.");
            }
        }
        System.out.println(name + " has finished the race!");
    }
}
package owais;
class Racer extends Thread {
    private String name;
    private int sleepTime;

    public Racer(String name, int sleepTime) {
        this.name = name;
        this.sleepTime = sleepTime;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " is at step " + i);
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                System.out.println(name + " was interrupted.");
            }
        }
        System.out.println(name + " has finished the race!");
    }
}
