public class MyThread2 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){  //Job of a Thread
            System.out.println("Child Thread 2");
        }
    }
}
