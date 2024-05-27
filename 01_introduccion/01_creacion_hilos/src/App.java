public class App {
    public static void main(String[] args) throws Exception {
        Thread hilo1 = new Thread( new Runnable() {

            @Override
            public void run() {
                System.out.println( Thread.currentThread().getName() );
            }

        } );
        Thread hilo2 = new Thread( new Runnable() {

            @Override
            public void run() {
                System.out.println( Thread.currentThread().getName() );
            }

        } );

        hilo1.start();
        hilo2.start();
    }
}
