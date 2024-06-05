class UserThread extends Thread{
    @Override
    public void run() {
        System.out.println("This is user defined thread.");
    }
}


public class MyThreaOp {

    public static void main(String[] args) {
        System.out.println("The program is started");
        int x=56+34;
        System.out.println("The sum is "+x);
        Thread t= Thread.currentThread();
        String name = t.getName();
        System.out.println("The name of the current thread is "+name);
        t.setName("New Name");
        System.out.println("The name of the current thread is "+t.getName());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(t.threadId());

        UserThread userThread = new UserThread();
        userThread.start();

        System.out.println("the Program ended..");
    }
}
