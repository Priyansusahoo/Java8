class Case3 {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.m1();
    }
}

class Outer {
    class Inner {
        public void m1() {
            System.out.println("Inner - m1()");
        }
    }
    
    public void m2() {
            System.out.println("Outer - m2()");
    }
}