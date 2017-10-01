public class Pause {
    public static void pause(double x) {
        try {
            Thread.sleep((long) (x * 1000));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
