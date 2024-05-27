import java.util.concurrent.Semaphore;

public class App2 {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);
        try {
            sem.acquire();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Semaforos: " + sem.availablePermits());
        sem.release();
        System.out.println("Semaforos: " + sem.availablePermits());
    }

}
