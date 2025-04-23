package game;

public class Main {

    public static void main(String[] args) {
        new Adventure().startGame();
    }

    public static void Sleep(int seconds) {
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
