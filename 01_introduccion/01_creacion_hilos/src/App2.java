public class App2 {
    public static void main(String[] args) {
        Tarea tarea = new Tarea();
        Thread hilo1 = new Thread(tarea);
        Thread hilo2 = new Thread(tarea);

        hilo1.start();
        hilo2.start();
    }
}
