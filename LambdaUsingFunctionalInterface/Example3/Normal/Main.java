@FunctionalInterface
interface Interf{
    public int getLength(String s);
}
class Demo implements Interf{
    @Override
    public int getLength(String s){
        return s.length();
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Interf i = new Demo();
        System.out.print(i.getLength("abcbad"));
    }
}