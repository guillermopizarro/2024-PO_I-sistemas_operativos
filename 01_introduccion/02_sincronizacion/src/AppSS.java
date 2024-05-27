import java.util.ArrayList;
import java.util.List;

public class AppSS {

    private static int contador = 0;

    public static void main(String[] args) throws Exception {
        List<Thread> hilos = new ArrayList<Thread>();
        int numHilos = 10000;

        System.out.println(contador);
        for (int i=1; i<=numHilos; i++) {
            Thread hilo = new Thread( AppSS::incrementar );
            hilo.start();
            hilos.add(hilo);
        }

        for (Thread hilo : hilos) {
            hilo.join();
        }

        System.out.println(contador);
    }

    public static void incrementar() {
        contador++;
    }
}
