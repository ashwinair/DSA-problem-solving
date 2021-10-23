public class pointer {
    public static void main(String[] args){
        int a = 10;
        long b = System.identityHashCode(a);
        System.out.println(b);
    }
}
