package sap.ru.hw.hw03.pingpong;

public class Pingponger {
    private Runnable ping;
    private Runnable pong;
    private Object monitor;
    private boolean isPing;


        public Pingponger() {
        this.ping = () -> {
                synchronized (monitor) {
                    while (true) {
                    if (isPing) {
                        System.out.println("PING");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        isPing = false;
                        monitor.notify();
                    }
                    try {
                        monitor.wait();
                    } catch (InterruptedException e) {
                            e.printStackTrace();
                    }
                }
            }
        };
        this.pong = () -> {
                synchronized (monitor) {
                    while (true) {
                    if (!isPing) {
                        System.out.println("PONG");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        isPing = true;
                        monitor.notify();
                    }
                    try {
                        monitor.wait();
                    } catch (InterruptedException e) {
                            e.printStackTrace();
                    }
                }
            }
        };
        monitor = new Object();
        isPing = true;
    }

    public void pingpong() {
        new Thread(ping).start();
        new Thread(pong).start();
    }



}
