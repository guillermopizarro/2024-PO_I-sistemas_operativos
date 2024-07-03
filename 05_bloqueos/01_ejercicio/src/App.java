public class App {
    public static void main(String[] args) throws Exception {
        CuentaBancaria cuenta = new CuentaBancaria();

        Thread hilo1 = new Thread( new Runnable() {
            public void run() {
                for (int i=1; i<=100; i++) {
                    cuenta.depositar(10);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                }
            }
        } );

        Thread hilo2 = new Thread( new Runnable() {
            public void run() {
                for (int i=1; i<=10; i++) {
                    cuenta.retirar(10);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                }                
            }            
        } );

        hilo1.start();
        hilo2.start();
    }
}