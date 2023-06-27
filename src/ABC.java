class Thred implements Runnable {
    public void run()
    {
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }
        System.out.println("The State of thread t1 while it invoked the method join() on thread" + ABC.t1.getState());

        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }
    }
}

public class ABC implements Runnable
{
    public static  Thread t1;
    public static ABC obj;
    public static void main(String[] args)
    {
        obj = new ABC();
        t1 = new Thread(obj);
        System.out.println("The State of thread t1 after runnning it - " + t1.getState());
        t1.start();
        System.out.println("the State of thread t1 after involving the thread -"+t1.getState());
    }

    public void run()
    {

    }
}