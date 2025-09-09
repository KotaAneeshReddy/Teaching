public class MyRunnable implements Runnable{

    @Override
    public void run(){
        for(int i=0;i<5;i++){  //Job of a Thread
            System.out.println("Runnable Thread 1");
        }
    }
}
