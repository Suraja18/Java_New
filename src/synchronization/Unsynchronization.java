package synchronization;

public class Unsynchronization {
    public static void main(String[] args)
    {
        Table obj = new Table();
        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);
        t1.start();
        t2.start();
    }
}
