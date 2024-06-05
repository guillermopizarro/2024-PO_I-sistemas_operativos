public class HiloMutex extends Thread {

    private Mutex mutex;
    private static int contador = 0;

    public HiloMutex(Mutex mutex) {
        this.mutex = mutex;
    }

    public void run() {
        this.mutex.bloquear();

        this.contador++;

        this.mutex.desbloquear();
    }

    public static int getContador() {
        return contador;
    }
}