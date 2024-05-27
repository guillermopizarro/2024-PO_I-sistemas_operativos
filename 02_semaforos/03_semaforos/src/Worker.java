import java.util.concurrent.Semaphore;

public class Worker extends Thread {
    
    private SharedResource resource;
    private Semaphore sem;

    public Worker(SharedResource resource, Semaphore sem) {
        this.resource = resource;
        this.sem = sem;
    }

    public void run() {
        try {
            this.sem.acquire();

            System.out.println(this.sem.availablePermits());
            this.resource.use();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            this.sem.release();
        }
    }
}
