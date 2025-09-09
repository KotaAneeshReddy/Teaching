public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt = Thread.currentThread();
        MyThread t  = new MyThread();
        t.start(); //Starting of a Thread
        for(int i=0; i<5;i++){
            Thread.sleep(2000);
            System.out.println("Main Thread");
        }
//        MyRunnable r = new MyRunnable();
//        Thread t = new Thread(r);
//        t.start();
////        r.start();
//        for(int i=0; i<5;i++){
//            System.out.println("Main Thread");
//        }
    }
}
