import java.util.Scanner;

class userdetails2  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        int age = 0;
        String contact = "";
        boolean validInput = false;
        do {
            System.out.print("Enter your Name: ");
            name = sc.nextLine();

            System.out.print("Enter your Age: ");
            if (sc.hasNextInt()) {
                age = sc.nextInt();
                sc.nextLine();
                validInput = true;
            } else {
                sc.nextLine();
                System.out.println("Invalid age. Please enter a valid integer.");
            }
        } while (!validInput);
        System.out.print("Enter your Contact: ");
        contact = sc.nextLine();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Contact: " + contact);
        System.out.println("Welcome to Mallareddyuniversity");
        sc.close();
    }
}
