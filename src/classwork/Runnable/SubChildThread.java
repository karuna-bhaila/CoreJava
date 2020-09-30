package classwork.Runnable;

public class SubChildThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Sub Child Running " + i);
        }
    }
}
