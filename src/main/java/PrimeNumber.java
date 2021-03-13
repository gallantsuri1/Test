import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //printAllPrimesCount();
        //primesCount();
        primesCount1();
    }
    public static void scannerPrimeCheck(){
        Scanner scanner = new Scanner(System.in);
        int n = -1;
        while( (n=scanner.nextInt()) != -1){
            if (isPrime(n, n/2)) {
                System.out.println("Prime: " +n);
            } else {
                System.out.println("Not prime: "+n);
            }
        }
    }

    public static void primesCount() {
        long time = System.currentTimeMillis();
        int n=1000000, count=0;
        List<Integer> list = new ArrayList<>();
        for (int i=2; i<=n; i++){
            boolean isPrime = true;
            for (int j=0; j<list.size(); j++) {
                if (i%list.get(j) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                count++;
                list.add(i);
            }
        }
        System.out.println(count);
        System.out.println("Total time took: " + (System.currentTimeMillis()-time)/1000);
    }
    public static void primesCount1() {
        long time = System.currentTimeMillis();
        int n=100000, count=0;
        for (int i=2; i<=n; i++){
            boolean isPrime = true;
            for (int j=2; j<=Math.floor(Math.sqrt(i)); j++) {
                if (i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                count++;
        }
        System.out.println(count);
        System.out.println("Total time took: " + (System.currentTimeMillis()-time)/1000);
    }


    public static void printAllPrimesCount(){
        int n=1000000, count=0;
        for (int i=2; i<=n; i++) {
            if (isPrime(i, i/2)) {
                count++;
            }
        }
        System.out.println("Total primes: "+count);
    }

    public static boolean isPrime(int n, int d) {
        if (d <= 1) return true;
        if (n%d == 0) return false;
        return isPrime(n, d-1);
    }
}
