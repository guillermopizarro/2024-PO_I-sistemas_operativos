public class App4 {
    public static void main(String[] args) {
        Thread hilo1 = new Thread(new Tarea2("Hilo-1"));
        Thread hilo2 = new Thread(new Tarea2("Hilo-2"));
        Thread hilo3 = new Thread(new Tarea2("Hilo-3"));
        Thread hilo4 = new Thread(new Tarea2("Hilo-4"));
        Thread hilo5 = new Thread(new Tarea2("Hilo-5"));

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
    }
}
