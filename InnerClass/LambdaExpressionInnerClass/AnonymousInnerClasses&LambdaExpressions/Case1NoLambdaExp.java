// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Case1NoLambdaExp {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Runnable r = new Runnable(){
            public void run(){
              for(int i = 0;i<50;i++){
                  System.out.println("child");
              }
            }
        };
        Thread t = new Thread(r);
        t.start();
        for(int i= 0;i< 50;i++){
            System.out.println("main");
        }
    }
}