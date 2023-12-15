package Th_trienKhai_Object_Pool;

public class ObjectPoolDemo {
    public static final int NUM_OF_CLIENT = 20;

    public static void main(String[] args) {
        TaxiPool taxiPool = new TaxiPool();
        for (int i = 1; i < NUM_OF_CLIENT; i++) {
            Runnable client = new TaxiThread(taxiPool);
            Thread thread = new Thread(client);
            thread.start();
        }
    }
}


