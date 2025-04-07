/**
 * Runnable is a Functional Interface
 */
class Main {
    public static void main(String[] args) {
        System.out.println("Lambda-Implementation");
        Runnable r = () -> {
            for(int i =0; i< 10; i++) {
                System.out.println("Lambda : Child thread running - " + i);
            }
        };
        Thread t1 = new Thread(r);
        t1.start();
        // Main thread - sample code
        for(int i =0; i< 10; i++){
            System.out.println("Main Thread " + i);
        }
    }
}