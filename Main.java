public class Main {
    public static void main(String[] args) {

        // custom thread using the runnable interface
        MyThread t1 = new MyThread();
        //custom threads using thread class
        MyThreadsThread t2 = new MyThreadsThread();
        for(int i=0;i<10;i++) {
            System.out.println("Thread number started is "+i);
            Thread thread = new Thread(t1);
            thread.start();
            t2.start();

        }




        System.out.println("Hello world!");
    }
}