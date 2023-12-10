package SingletonPattern;

public class centralQueueSystem {
    private static centralQueueSystem instance;
    private int queueNumber;

    private centralQueueSystem(){
        queueNumber = 1;
    }

    public static synchronized centralQueueSystem getInstance(){
        if (instance == null)
                instance = new centralQueueSystem();
        return instance;
    }

    public synchronized int getQueueNumber(){
        System.out.println("Now serving queue number: " + queueNumber);
        return queueNumber;
    }

    public synchronized void resetQueue (int newQueue){
        queueNumber = newQueue;
        System.out.println("The Queue has been reset!");
    }

    public synchronized  void increaseQueueNumber(){
        queueNumber++;
        System.out.println("Now serving queue number: " + queueNumber);
    }




}
