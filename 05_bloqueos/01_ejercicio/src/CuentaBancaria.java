import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CuentaBancaria {

    private float saldo;
    private final Lock bloqueo;

    public CuentaBancaria() {
        this.bloqueo = new ReentrantLock();
        this.saldo = 0;
    }

    public void depositar(float cantidad) {
        this.bloqueo.lock();
        this.saldo += cantidad;
        System.out.println("DEPOSITO - Saldo: " + this.saldo);
        this.bloqueo.unlock();
    }

    public void retirar(float cantidad) {
        this.bloqueo.lock();
        this.saldo -= cantidad;
        System.out.println("RETIRO - Saldo: " + this.saldo);
        this.bloqueo.unlock();
    }

    public float getSaldo() {
        return this.saldo;
    }
}