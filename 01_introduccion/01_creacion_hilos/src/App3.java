public class App3 {
    public static void main(String[] args) {
        Thread hilo1 = new Thread( App3::imprimir );
        Thread hilo2 = new Thread( App3::imprimir );
        
        hilo1.start();
        hilo2.start();
    }

    public static void imprimir() {
        System.out.println( Thread.currentThread().getName() );
    }
}
