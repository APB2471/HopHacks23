import java.util.Scanner;

public class Profile {
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String city;
    private String state;
    private String zip;
    private String comments;

    public void Profile(String username, String firstName, String lastName,
                        String email, String phone, String city, String state, String zip,
                        String comments) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone= phone;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.comments = comments;
    }

    public void NewProfile() {
        Scanner sc = new Scanner(System.in);


        System.out.println("First Name:");
        String firstName = sc.nextLine();
        System.out.println("Last Name:");
        System.out.println(lastName);
        System.out.println("Email:");
        System.out.println(email);
        System.out.println("Daytime Phone:");
        System.out.println(daytimePhone);
        System.out.println("City:");
        System.out.println(city);
        System.out.println("State:");
        System.out.println(state);
        System.out.println("ZIP Code:");
        System.out.println(zipCode);
        System.out.println("Questions or Comments:");

    }
}
