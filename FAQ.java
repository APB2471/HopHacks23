public class FAQ {
    public static void main(String[] args) {
        Scanner userFAQ = new Scanner(System.in);
        int x = 1;
        while (x != 0) {
            System.out.println("[0] - Quit");
            System.out.println("[1] What is the purpose of clinical trials? ");
            System.out.println("[2] Who conducts clinical trials? ");
            System.out.println("[3] What are the potential benefits of participating in a trial? ");
            System.out.println("[4] What are the different phases of clinical trials? ");
            System.out.println("[5] What is informed consent? ");
            System.out.println("[6] Can I leave a clinical trial if I change my mind? ");
            System.out.println("[7] Are clinical trials only for serious illnesses? ");
            System.out.println("Enter a number from the menu above: ");
            x = userFAQ.nextInt();

            if (x == 1) {
                System.out.println("Clinical trials are conducted to gather data on the safety and efficacy of new treatments, compare them to existing treatments, or investigate new ways to use existing treatments. The goal is to improve medical care and advance scientific knowledge.");
            } else if (x == 2) {
                System.out.println("Clinical trials are typically conducted by researchers, academic institutions, pharmaceutical companies, or government agencies. These organizations follow strict protocols and ethical guidelines.");
            }
        }
        userFAQ.close();
    }
}
