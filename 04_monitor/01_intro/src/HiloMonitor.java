public class HiloMonitor extends Thread {

    private Monitor monitor;

    public HiloMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void run() {
        monitor.incrementar();
    }
}
