import java.util.ArrayList;
import java.util.List;

public class ListaHilosMonitor {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();

        List<HiloMonitor> hilos = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            HiloMonitor hilo = new HiloMonitor(monitor);
            hilos.add(hilo);
            hilo.start();
        }

        for (HiloMonitor hilo : hilos) {
            try {
                hilo.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        System.out.println("El valor del contador es: " + monitor.getContador());
    }
}
