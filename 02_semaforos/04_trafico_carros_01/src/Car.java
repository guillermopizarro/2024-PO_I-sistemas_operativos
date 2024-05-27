import java.util.concurrent.Semaphore;

public class Car extends Thread {

    private String direction;
    private Semaphore sem;

    public Car(String direction, Semaphore sem) {
        this.direction = direction;
        this.sem = sem;
    }

    public void run() {
        try {
            System.out.println("Carro esperando ir hacia " + this.direction);
            this.sem.acquire();
            System.out.println("Carro en camino hacia " + this.direction);
            // El carro esta transitando el camino peatonal 
            Thread.sleep(1000);
            System.out.println("Carro pasó hacia " + this.direction);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            this.sem.release();
        }
    }
}
