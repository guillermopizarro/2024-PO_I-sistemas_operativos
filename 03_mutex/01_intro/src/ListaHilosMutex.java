import java.util.ArrayList;
import java.util.List;

public class ListaHilosMutex {
    public static void main(String[] args) {
        Mutex mutex = new Mutex();

        List<HiloMutex> hilos = new ArrayList<HiloMutex>();
        for (int i=1; i<=10000; i++) {
            HiloMutex hilo = new HiloMutex(mutex);
            hilos.add(hilo);
            hilo.start();
        }

        for (HiloMutex hilo: hilos) {
            try {
                hilo.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        System.out.println("El valor del contador es: " + HiloMutex.getContador());
    }
}