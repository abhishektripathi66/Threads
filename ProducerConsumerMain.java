public class ProducerConsumerMain {

    //main method for both consumer and producer
    public static void main(String[] args) {
        Company company = new Company();
        Poducer producer = new Poducer(company);
        Consumer consumer = new Consumer(company);
        producer.start();
        consumer.start();
    }


}
