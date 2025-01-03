import java.util.*;
class user2{

    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean a = true;
        while(true){
            System.out.print("Enter username: ");
            String id = sc.next();
            System.out.print("Enter password: ");
            String pass = sc.next();
            if((id.equals("Surya")) && (pass.equals("Surya_123"))){
                System.out.println("Hello Surya, You are welcome ");
                break;
            }else{
                System.out.println("credentials does not match. Please try again.");
            }
        }
    }

    public static Scanner getSc() {
        return sc;
    }
}