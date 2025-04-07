@FunctionalInterface
interface Interf{
    public int getLength(String s);
}
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Interf i = s -> s.length();
        System.out.print(i.getLength("abcde"));
    }
}