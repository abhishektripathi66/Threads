public class Company {

    int n;
    boolean flag = false;
    // synchronized is used for synchronizing the threads
    public synchronized void produceItem(int n){
        //if condition used for the intercommunication between the threads
        if(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.n=n;
        System.out.println("Data is produced : "+this.n);
        this.flag=true;
        notify();
    }

    public synchronized int consumeItem(){
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Consumed : "+this.n);
        flag=false;
        notify();
        return this.n;
    }
}
