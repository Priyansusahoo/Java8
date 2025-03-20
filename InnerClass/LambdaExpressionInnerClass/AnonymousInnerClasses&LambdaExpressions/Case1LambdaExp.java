class Case1LambdaExp {
    public static void main (String[] args) {
        Thread t = new Thread(() -> {
            for (int i = 0;i<50;i++) {
                System.out.println("Child");
            }
        });
        t.start();
        for (int i = 0;i<50;i++) System.out.println("Daemon");
    }
}


/*class Case1LambdaExp {
    public static void main (String[] args) {
        Runnable r = () -> {
            for (int i = 0;i<50;i++) {
                System.out.println("Child");
            }
        };
        Thread t = new Thread(r);
        t.start();
        for (int i = 0;i<50;i++) {
                System.out.println("Daemon");
        }
    }
}*/