import java.util.Scanner;

public class Prospectives {
    private String firstName;
    private String lastName;
    private String email;
    private int daytimePhone;
    private String city;
    private String state;
    private int zipCode;
    private String;

    public void Profile(String firstName) {
        this.firstName = firstName;
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
        System.out.println(questions);

    }
}
