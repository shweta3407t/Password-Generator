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


                        System.out.print("inclide uppercase ? (y/n): ");
                        boolean uppercase=sc.nextLine().equalsIgnoreCase( "y");

                        System.out.print("include lowercase ? (y/n) : ");
                        boolean lowercase=sc.nextLine().equalsIgnoreCase( "y");

                        System.out.print("include number ? (y/n) : ");
                        boolean number=sc.nextLine().equalsIgnoreCase("y");

                        System.out.print("inclide symbol ? (y/n) : ");
                        boolean symbol=sc.nextLine().equalsIgnoreCase( "y");

                         
                        String pass =service.PasswordService. generatePassword(length, uppercase, lowercase, number, symbol);
                         
                        System.out.println("Generated password : "+pass);

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
                        System.out.println("invalide option selected ");
                        break;
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
