package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

class MyCallable implements Callable<String> {

    private int taskNum;

    public MyCallable(int taskNum) {
        this.taskNum = taskNum;
    }

    @Override
    public String call() throws Exception {
        System.out.println(taskNum+"任务启动");
        Date date1 = new Date();
        Thread.sleep(1000);
        Date date2 = new Date();
        long time = date2.getTime() - date1.getTime();
        System.out.println(taskNum+"任务中止");
        return taskNum+"任务返回结果，执行了"+time+"毫秒";
    }
}

public class TestCallable{

    public synchronized static void say(){
        System.out.println("haha");
    }

    public synchronized void run(){
        System.out.println("run");
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Date d1 = new Date();
        int taskSize = 5;
        ExecutorService pool = Executors.newFixedThreadPool(taskSize);
        List<Future> list = new ArrayList<>();
        for (int i = 0; i < taskSize; i++) {
            Callable c = new MyCallable(i);
            Future f = pool.submit(c);
            list.add(f);
        }
        pool.shutdown();
        for (Future f :
                list) {
            System.out.println(f.get().toString());
        }
        Date d2 = new Date();
        System.out.println("程序运行结束，总共运行了"+(d2.getTime()-d1.getTime())+"毫秒");
    }

}
