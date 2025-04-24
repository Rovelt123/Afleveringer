package game;

public class Main {

    public static void main(String[] args) {
        new Adventure().startGame();
    }


    //Just a generic method to sleep
    public static void Sleep(int seconds) {
        try {
            Thread.sleep(seconds* 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
