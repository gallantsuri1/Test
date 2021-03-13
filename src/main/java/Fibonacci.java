public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci t = new Fibonacci();
        t.fibonacci(1, 0,Integer.valueOf(args[0]));
    }

    private void fibonacci(int p, int c, int n){
        if (n > 0) {
            System.out.println(p+c);
            fibonacci(c, p+c, --n);
        }
    }
}
