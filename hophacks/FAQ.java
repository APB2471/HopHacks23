import java.util.Scanner;

public class FAQ {
    public void QA() {
        Scanner userFAQ = new Scanner(System.in);
        int x = 1;
        System.out.println("[0] - Quit");
        System.out.println("[1] What is the purpose of clinical trials? ");
        System.out.println("[2] Who conducts clinical trials? ");
        System.out.println("[3] What are the potential benefits of participating in a trial? ");
        System.out.println("[4] What are the potential risks of participating in a trial? ");
        System.out.println("[5] What are the different phases of clinical trials? ");
        System.out.println("[6] What is informed consent? ");
        System.out.println("[7] Can I leave a clinical trial if I change my mind? ");
        System.out.println("[8] Are clinical trials only for serious illnesses? ");
        System.out.println("[9] Are clinical trials safe? ");
        System.out.println("[10] Can people with pre-existing medical conditions participate in clinical trials? ");
        System.out.println("[11] What is a placebo in a clinical trial? ");
        System.out.println("[12] WHat happens after a clinical trial is completed? ");

        while (x != 0) {
            System.out.println("");
            System.out.println("Enter a number from the menu above: ");
            x = userFAQ.nextInt();

            if (x == 1) {
                System.out.println("Clinical trials are conducted to gather data on the safety and efficacy of new treatments, compare them to existing treatments, or investigate new ways to use existing treatments.\n" +
                        "The goal is to improve medical care and advance scientific knowledge.");
                System.out.println("For further information, please consult: https://www.nlm.nih.gov/oet/ed/ceal/what-is-a-clinical-trial.html?_gl=1*kba16d*_ga*MTk2NDY1OTg5MS4xNjk0ODM0Mjgy*_ga_7147EPK006*MTY5NDgzNDI4MS4xLjAuMTY5NDgzNDI4MS4wLjAuMA..*_ga_P1FPTH9PL4*MTY5NDgzNDI4MS4xLjAuMTY5NDgzNDI4MS4wLjAuMA..&_ga=2.25151288.302808053.1694834282-1964659891.1694834282");
            } else if (x == 2) {
                System.out.println("Clinical trials are typically conducted by researchers, academic institutions, pharmaceutical companies, or government agencies.\n" +
                        " These organizations follow strict protocols and ethical guidelines.");
                System.out.println("For further information, please consult: ");
            } else if (x == 3) {
                System.out.println("Participants may gain access to potentially life-saving or cutting-edge treatments before they are widely available.\n" +
                        "They also contribute to medical research that can benefit future patients.");
                System.out.println("For further information, please consult: ");
            } else if (x == 4) {
                System.out.println("Risks can include side effects from the treatment, the treatment not being effective, or unknown long-term consequences.\n" +
                        "The informed consent process outlines these risks.");
                System.out.println("For further information, please consult: ");
            } else if (x == 5) {
                System.out.println("Clinical trials are typically divided into four phases:\n" +
                        "Phase I: Initial testing in a small group of healthy volunteers to assess safety and dosage.\n" +
                        "Phase II: Testing in a larger group of people with the target condition to assess efficacy and side effects.\n" +
                        "Phase III: Large-scale testing involving a more diverse patient population to further evaluate safety and effectiveness.\n" +
                        "Phase IV: Post-market surveillance to monitor the long-term safety and effectiveness of the treatment after it's approved.");
                System.out.println("For further information, please consult: ");
            } else if (x == 6) {
                System.out.println("Informed consent is the process where you receive detailed information about the clinical trial, including its purpose, procedures, potential risks, and benefits. \n" +
                        "You have the right to ask questions and fully understand what you are agreeing to before participating.");
                System.out.println("For further information, please consult: ");
            } else if (x == 7) {
                System.out.println("Yes, you can withdraw from a clinical trial at any time without penalty. Your safety and well-being are top priorities.");
                System.out.println("For further information, please consult: ");
            } else if (x == 8) {
                System.out.println("No, clinical trials cover a wide range of medical conditions, from serious diseases to more common conditions. There are trials for various health concerns.");
                System.out.println("For further information, please consult: ");
            } else if (x == 9) {
                System.out.println("Yes, clinical trials are conducted with a strong focus on participant safety, adhering to rigorous ethical and regulatory standards.\n" +
                        "These standards are in place to minimize risks and ensure the well-being of individuals who choose to participate in clinical research.\n" +
                        "Clinical trials are closely monitored by research teams and regulatory authorities. Safety measures include regular medical assessments, reporting of adverse events, and oversight by ethics committees.");
                System.out.println("For further information, please consult: ");
            } else if (x == 10) {
                System.out.println("It depends on the trial. Some trials specifically seek participants with certain medical conditions, while others may have inclusion or exclusion criteria based on the condition being studied.");
                System.out.println("For further information, please consult: ");
            } else if (x == 11) {
                System.out.println("A placebo is a harmless, inactive substance (like a sugar pill) given to some participants in a clinical trial.\n" +
                        "It is used to compare the effects of the experimental treatment to those of no treatment.");
                System.out.println("For further information, please consult: ");
            } else if (x == 12) {
                System.out.println("After a trial concludes, the data is analyzed to determine the treatment's safety and effectiveness.\n" +
                        "If successful, the treatment may move toward approval for wider use, while unsuccessful trials help refine future research.\n");
                System.out.println("For further information, please consult: ");
            } else {
                break;
            }
        }
        userFAQ.close();
    }
}
