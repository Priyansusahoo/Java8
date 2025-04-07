/**
 * Runnable is a Functional Interface
 */
class Main {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Normal-Implementation");
        // Test test = new Test();
        Runnable r1 = new Test();
        Thread t1 = new Thread(r1);
        t1.start();
        // t1.join();
        // Main thread - sample code
        for(int i =0; i< 10; i++){
            System.out.println("Main Thread " + i);
        }
    }
}
class Test implements Runnable{
    @Override
    public void run(){
        for(int i =0; i< 10; i++){
            System.out.println("Running run() in Test class which implements Runnable-Interface - " + i);
        }
    }
}
