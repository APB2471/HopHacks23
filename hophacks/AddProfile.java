import java.util.Scanner;

/**
 * Form for adding a new profile to the system.
 */
public class AddProfile {
    public Profile NewProfile() {
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
        System.out.println("Sex:");
        String sex = sc.nextLine();
        System.out.println("Age:");
        Integer age = sc.nextInt();
        System.out.println("Race:");
        String race = sc.nextLine();
        System.out.println("Relevant Previous Treatments");
        String prevTreatments = sc.nextLine();
        System.out.println("Other Health Treatments");
        String otherHealthTreatments = sc.nextLine();
        System.out.println("Disease (Enter N/A if not applicable)");
        String disease = sc.nextLine();
        System.out.println("Stage of disease (Enter N/A if not applicable)");
        String stage = sc.nextLine();
        System.out.println("Additional Information:");
        String info = sc.nextLine();


        return new Profile(username, firstName,lastName,
                 email, phone, city, state,
                zip, sex, info, age, race,
               prevTreatments, otherHealthTreatments,
                disease, stage);

    }
}
