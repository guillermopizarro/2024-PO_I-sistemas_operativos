import java.util.concurrent.Semaphore;

public class App {
    public static void main(String[] args) throws Exception {
        Semaphore sem = new Semaphore(1);

        new Car("NORTE", sem).start();
        new Car("NORTE", sem).start();
        new Car("NORTE", sem).start();
    }
}
