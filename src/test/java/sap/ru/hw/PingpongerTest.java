package sap.ru.hw;


import org.junit.jupiter.api.Test;
import sap.ru.hw.hw03.pingpong.Pingponger;

public class PingpongerTest {

    @Test
    public void pingpongTest() {
        new Pingponger().pingpong();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
