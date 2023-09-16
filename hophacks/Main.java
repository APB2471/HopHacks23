import java.util.Scanner;

/**
 * Main class begins the input loop that starts
 * when the program is initialized.
 *
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("TrialHelp 1.0");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter your selection");
            System.out.println("1: Quit");
            System.out.println("2: FAQs");
            int choice = sc.nextInt();
            if (choice == 1) {
                break;
            } else if (choice == 2) {
                FAQ faq = new FAQ();
                faq.QA();
            }
        }
    }
}
