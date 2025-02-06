import java.util.*;

public class Demo060 {
    public static void main(String[] args) {
        System.out.print("Enter the position of the Fibonacci number: ");
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  
        Fibonacci fib = new Fibonacci();
        System.out.print("Fibonacci numbers series: ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(fib.fibonacci(i) + " ");
        }
    }
}

class Fibonacci {
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
