package interview;

public class App {

    public void oddPrint() throws InterruptedException {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 1) {
                    System.out.println(i + " " + "THREAD_ODD");
                    wait();
                    notify();
                }
            }
        }
    }

    public void evenPrint() throws InterruptedException {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " " + "THREAD_EVEN");
                    notify();
                    wait();
                }
            }
        }
    }

}

class Main {
    public static void main(String[] args) throws InterruptedException {
        App app = new App();
        Thread t1 = new Thread(() -> {
            try {
                app.oddPrint();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                app.evenPrint();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();
    }
}
