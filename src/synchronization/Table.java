package synchronization;

public class Table {
    /*synchronized void printTable(int n)
    {
        for(int i =1; i<=5; i++){
            System.out.println(n*i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException ie){
                System.out.println(ie);
            }
        }
    }*/

    void printTable(int n){
        synchronized (this){// This is a synchronized block
            for(int i =1; i<=5; i++ ){
                System.out.println(n*i);
                try{
                    Thread.sleep(500);
                }catch (InterruptedException ie){
                    System.out.println(ie);
                }
            }
        }
    }
}
