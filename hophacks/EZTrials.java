import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * Main class begins the input loop that starts
 * when the program is initialized.
 *
 * ASCII Art based on design by Joan G. Stark
 */
public class EZTrials {
    static Profile currentProfile;
    public static void main(String[] args) {
        ArrayList<Profile> profiles = new ArrayList<>();
        System.out.println("                            _\n" +
                        "                          .' `'.__\n" +
                        "                         /      \\ `'\"-,\n" +
                        "        .-''''--...__..-/ .     |      \\\n" +
                        "      .'               ; :'     '.  a   |\n" +
                        "     /                 | :.       \\     =\\\n" +
                        "    ;                   \\':.      /  ,-.__;.-;`\n" +
                        "   /|     .              '--._   /-./`._..-;`\n" +
                        "  ; |       '                |`-'      \\  =|\n" +
                        "  |/\\        .   -' /     /  ;         |  =/\n" +
                        "  (( ;.       ,_  .:|     | /     /\\   | =|\n" +
                        "   ) / `\\     | `\"\"`;     / |    | /   / =/\n" +
                        "     | ::|    |      \\    \\ \\    \\ `--' =/\n" +
                        "    /  '/\\    /       )    |/     `-...-`\n" +
                        "   /    | |  `\\    /-'    /;\n" +
                        "   \\  ,,/ |    \\  |     .'  \\\n" +
                        "    `\"\"`   \\ \\  |___.-'L____ \n" +
                        "            `\"\"\"`");
        System.out.println("EZTrials 1.1");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter your selection");
            System.out.println("1: Quit");
            System.out.println("2: FAQs");
            System.out.println("3: Create profile");
            System.out.println("4: Log in");
            int choice = sc.nextInt();
            if (choice == 1) {
                break;
            } else if (choice == 2) {
                FAQ faq = new FAQ();
                faq.QA();
            } else if (choice == 3) {
                AddProfile ap = new AddProfile();
                Profile newProfile = ap.NewProfile();
                System.out.println(newProfile.getUsername());
                profiles.add(newProfile);
                System.out.println("Your new profile" + newProfile.getUsername() +
                        "has been created");
            } else if (choice == 4) {
                System.out.println("Enter your username: ");
                String checkUsername = sc.nextLine();
                for (Profile profile : profiles) {
                    if (Objects.equals(profile.getUsername(), checkUsername)) {
                        currentProfile = profile;
                    }
                }
            } else {
                System.out.println("Invalid selection, please type the" +
                        "number of an option listed.");
            }
        }
    }
}
