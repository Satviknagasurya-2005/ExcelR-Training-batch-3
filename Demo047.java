import java.util.Scanner;

public class Demo047 {
    public static void main(String[] args) {
        CountDigits countDigits = new CountDigits();
        countDigits.CountDigits();
        
    }
}

class CountDigits{
    void CountDigits(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
}