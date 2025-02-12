import java.util.Scanner;
public class Demo076 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array: ");
        for (int i=0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        secondMaxNumber(arr);
        sc.close();
    }
    static void secondMaxNumber(int[] arr){
        int max1 = arr[0];
        int max2 = arr[0];
        for (int i=0; i < arr.length; i++){
            if (arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2){
                max2 = arr[i];
            }
        }
        System.out.println("Second max number is: " + max2);
    }
}