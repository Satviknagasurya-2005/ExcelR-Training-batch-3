public class Demo062 {
    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if ( i >= 2){
                 System.out.println(
                        "The first element of the array is: " + arr[0] + " the second element of the array is: "
                                + arr[1] + " and the last element of the array is: " + arr[n - 1]);
                break;

            }
        }
    }
}
