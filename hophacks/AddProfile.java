import java.util.Scanner;

public class AddProfile {
    public void NewProfile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Username: ");
        String username = sc.nextLine();
        System.out.println("First Name:");
        String firstName = sc.nextLine();
        System.out.println("Last Name:");
        String lastName = sc.nextLine();
        System.out.println("Email:");
        String email = sc.nextLine();
        System.out.println("Phone Number:");
        String phone = sc.nextLine();
        System.out.println("City:");
        String city = sc.nextLine();
        System.out.println("State:");
        String state = sc.next();
        System.out.println("ZIP Code:");
        String zip = sc.nextLine();
        System.out.println("Additional Information:");
        String info = sc.nextLine();


    }
}
