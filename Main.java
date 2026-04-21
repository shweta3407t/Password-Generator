import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            while (true) {

                System.out.println("""
                          \nENTER :
                          1.GANERATE SINGLE PASSWORD
                          2.GENERATE MULTIPLE PASSWORD
                          3.EXIT
                        """);

                System.out.print("YOUR CHOICE : ");
                String choice = sc.nextLine().toLowerCase();

                boolean isValide = utils.InputValidator.isEmpty(choice);
                if (!isValide) {
                    continue;
                }
                boolean isRunning = true;
                while (isRunning) {
                    switch (choice) {
                        case "1":
                            System.out.print("ENTER PASSWORD LENGTH : ");
                            Integer length = sc.nextInt();
                            sc.nextLine();

                            System.out.print("inclide uppercase ? (y/n): ");
                            boolean uppercase = sc.nextLine().equalsIgnoreCase("y");

                            System.out.print("include lowercase ? (y/n) : ");
                            boolean lowercase = sc.nextLine().equalsIgnoreCase("y");

                            System.out.print("include number ? (y/n) : ");
                            boolean number = sc.nextLine().equalsIgnoreCase("y");

                            System.out.print("inclide symbol ? (y/n) : ");
                            boolean symbol = sc.nextLine().equalsIgnoreCase("y");

                            String pass = service.PasswordService.generatePassword(length, uppercase, lowercase, number,
                                    symbol);

                            System.out.println("Generated password : " + pass);

                            break;
                        case "2":
                            System.out.print("ENTER PASSWORD LENGTH : ");
                            Integer Mlength = sc.nextInt();

                             //TODO : validate length
                            sc.nextLine();

                            System.out.print("inclide uppercase ? (y/n): ");
                            boolean MUppercase = sc.nextLine().equalsIgnoreCase("y");

                            System.out.print("include lowercase ? (y/n) : ");
                            boolean MLowercase = sc.nextLine().equalsIgnoreCase("y");

                            System.out.print("include number ? (y/n) : ");
                            boolean MNumber = sc.nextLine().equalsIgnoreCase("y");

                            System.out.print("inclide symbol ? (y/n) : ");
                            boolean MSymbol = sc.nextLine().equalsIgnoreCase("y");

                            System.out.print("ENTER NUMBER OF PASSWORD : ");

                            Integer numberOfPassword = sc.nextInt();
                            sc.nextLine();

                            for (int i = 1; i < numberOfPassword; i++) {
                                String Mpass = service.PasswordService.generatePassword(Mlength, MUppercase, MLowercase,
                                        MNumber, MSymbol);
                                System.out.println(i + "GENERATED PASSWORD : " + Mpass);
                            }

                            break;
                        case " 3":
                            System.out.println("<<<<<<EXITING PROGRAM>>>>>");
                            System.exit(0);

                            break;
                        default:
                            System.out.println("INVALIDE OPTION SELECTED. ");
                            isRunning = false;
                            continue;
                    }
                }

            }
        } catch (Exception e) {
            sc.close();
            // TODO: handle exception
        }

    }
}
