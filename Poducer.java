public class Poducer extends Thread{

    Company company;

    Poducer(Company c){
        this.company=c;
    }
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            this.company.produceItem(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
