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
                System.out.println();

                switch (choice) {
                    case "1":
                        System.out.print("ENTER PASSWORD LENGTH : ");
                        Integer length = sc.nextInt();
                        sc.nextLine();

                        System.out.println("CHARACTER TYPE :U=UPPERCASE ,L=LOWERCASE,N=NUMBERS,S=SYMBOLES ");

                        System.out.print("ENTER PASSWORD CHARACTER TYPE : ");
                        String character = sc.nextLine().toLowerCase();
                         

                        service.PasswordService.generatePassword(length ,character);

                        

                        break;
                    case " 2":
                        System.out.print("ENTER PASSWORD LENGTH : ");
                        Integer Mlength = sc.nextInt();

                        System.out.println("CHARACTER TYPE :UPPERCASE ,LOWERCASE,NUMBERS,SYMBOLES ");

                        System.out.print("ENTER PASSWORD CHARACTER TYPE : ");
                        String Mcharacter = sc.nextLine();

                        System.out.print("ENTER NUMBER OF PASSWORD : ");

                        String numberOfPassword = sc.nextLine();
                        service.PasswordService.generatePassword(Mlength, Mcharacter, numberOfPassword);
                        break;
                    case " 3":
                        System.out.println("<<<<<<EXITING PROGRAM>>>>>");
                        System.exit(0);

                        break;
                    default:
                        break;
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
