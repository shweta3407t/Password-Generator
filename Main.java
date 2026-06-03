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

                            service.PasswordService.includeCharacter(sc, length);

                            isRunning = false;
                            break;
                        case "2":

                        System.out.print("ENTER PASSWORD LENGTH : ");
                            Integer Mlength = sc.nextInt();
                            sc.nextLine();
                            
                            System.out.print("\nENTER NUMBER OF PASSWORD : ");

                            Integer numberOfPassword = sc.nextInt();
                            sc.nextLine();

                            service.PasswordService.includeCharacter(sc, Mlength ,numberOfPassword);

                            
                            isRunning = false;
                            break;
                        case "3":
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
