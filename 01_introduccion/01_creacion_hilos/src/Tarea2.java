public class Tarea2 implements Runnable {

    private String nombre;

    public Tarea2(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        System.out.println( "Nombre del hilo: " + this.nombre );
    }
    
}
