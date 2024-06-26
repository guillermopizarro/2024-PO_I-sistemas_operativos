package semaforos;

import java.util.concurrent.Semaphore;

public class Connection {

    private static Connection instance = new Connection();
    private int connections = 0;
    private Semaphore sem = new Semaphore(10, true);

    public Connection() {

    }

    public static Connection getInstance() {
        return instance;
    }

    public void connect() {
        try {
            sem.acquire();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            doConnect();
        } finally {
            sem.release();
        }
    }

    public void doConnect() {
        synchronized (this) {
            connections++;
            System.out.println("BEFORE - Current connections: " + connections);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        synchronized(this) {
            connections--;
            System.out.println("AFTER - Current connections: " + connections);
        }
    }
}
