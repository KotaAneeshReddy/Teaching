public class MyThread extends Thread{
    static Thread mt;
    public void run(){
       try{
           mt.join();
       }catch (InterruptedException e){
           e.printStackTrace();
       }
        for(int i=0;i<5;i++){  //Job of a Thread
            System.out.println("Child Thread 1");
        }
    }
}
