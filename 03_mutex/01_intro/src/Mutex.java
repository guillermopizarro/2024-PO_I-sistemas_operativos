public class Mutex {
    private boolean recursoDisponible = true;

    synchronized public void bloquear() {
        while(!recursoDisponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        recursoDisponible = false;
    }

    synchronized public void desbloquear() {
        recursoDisponible = true;
        notifyAll();
    }
}
