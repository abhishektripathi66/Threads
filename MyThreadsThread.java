public class MyThreadsThread extends Thread{

    public  void run(){
        System.out.println("Active Thread Count is "+Thread.activeCount());
        for(int i=0;i<10;i++){
            System.out.println("The numer is "+i);
            try {
                Thread.sleep(100);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
