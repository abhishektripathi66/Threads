public class Consumer extends Thread{

    Company company;

    Consumer(Company company){
        this.company=company;
    }

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            this.company.consumeItem();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
