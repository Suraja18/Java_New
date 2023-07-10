package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Counter {
    private int count;
    public void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }
}
class IncrementTask implements Runnable{
    private final Counter counter;
    public IncrementTask(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run(){
        for (int i = 0; i<1000; i++){
            counter.increment();
        }
    }
}

public class MultithreadingProblem{
    public static void main(String[] args){
        Counter counter = new Counter();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i = 0; i<3; i++){
            Runnable task = new IncrementTask(counter);
            executorService.execute(task);
        }
        executorService.shutdown();
        //wait until all tasks are completed
        while (!executorService.isTerminated()){
            //do nothing
        }
        System.out.println("final count:" + counter.getCount());
    }
}