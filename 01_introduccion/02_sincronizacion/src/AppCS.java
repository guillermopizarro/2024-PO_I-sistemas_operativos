import java.util.ArrayList;
import java.util.List;

public class AppCS {

    private static int contador = 0;
    public static void main(String[] args) {
        List<Thread> hilos = new ArrayList<Thread>();
        int numHilos = 10000;

        System.out.println(contador);
        for (int i=1; i<=numHilos; i++) {
            Thread hilo = new Thread( AppCS::incrementar );
            hilo.start();
            hilos.add(hilo);
        }

        for (Thread hilo : hilos) {
            try {
                hilo.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        System.out.println(contador);
        
    }

    public synchronized static void incrementar() {
        contador++;
    }
}
