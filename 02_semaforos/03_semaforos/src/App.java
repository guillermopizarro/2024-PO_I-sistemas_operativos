import java.util.concurrent.Semaphore;

public class App {
    public static void main(String[] args) throws Exception {
        Semaphore sem = new Semaphore(3);
        SharedResource resource = new SharedResource();

        for (int i=1; i<=100; i++) {
            new Worker(resource, sem).start();
        }
    }
}
