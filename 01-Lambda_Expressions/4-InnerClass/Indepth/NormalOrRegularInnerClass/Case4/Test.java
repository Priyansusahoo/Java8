class Test{
    int x = 888;
    public void m2() {
        Interf i = new Interf(){
            int x = 999;
            public void m1(){
                System.out.println(this.x); // 999
            }
        };
        i.m1();
    }
    
    public static void main(String[] args) {
        Test t = new Test();
        t.m2();
    }
}

interface Interf{
    public void m1();
}