package sincronizacion;

public class Connection {

    private static Connection instance = new Connection();
    private int connections = 0;

    public Connection() {

    }

    public static Connection getInstance() {
        return instance;
    }

    public void connect() {
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
