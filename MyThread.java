


public class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Active Thread Count is "+Thread.activeCount());
        for(int i=0;i<=10;i++) {
            System.out.println("value of i is "+i);
            System.out.println("the id of the current thread is "+Thread.currentThread().threadId());

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
