import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("""
                          ENTER :
                          1.GANERATE SINGLE PASSWORD
                          2.GENERATE MULTIPLE PASSWORD
                          3.EXIT
                        """);
                        System.out.println("YOUR CHOICE : ");
                String choice = sc.nextLine().toLowerCase();

                switch (choice) {
                    case "1":
                        System.out.println("ENTER PASSWORD LENGTH : ");
                        Integer length = sc.nextInt();
                        sc.nextLine();

                        System.out.println("CHARACTER TYPE :UPPERCASE ,LOWERCASE,NUMBERS,SYMBOLES ");
                        // String uppercase="qwertyuioplkjhgfdsazxcvbnm";
                        StringBuilder lowercase="QWERTYUIOPLKJHGFDSAZXCVBNM";
                        Integer number=1234567890;
                        String symbole="!@#$%^&*";

                        System.out.println("ENTER PASSWORD CHARACTER TYPE : ");
                         StringBuilder character=new StringBuilder(sc.next().toLowerCase());

                            if(character==uppercase){
                                  service.PasswordService.generatePassword(length, character);
                            }else if(lowercase){
                                service.PasswordService.generatePassword(length, character);
                            }  else if(number){
                                     service.PasswordService.generatePassword(length, character);
                                }else if(symbole){
 service.PasswordService.generatePassword(length, character);
                                }

                        

                        break;
                    case " 2":
                        System.out.println("ENTER PASSWORD LENGTH : ");
                        Integer Mlength = sc.nextInt();

                        System.out.println("CHARACTER TYPE :UPPERCASE ,LOWERCASE,NUMBERS,SYMBOLES ");

                        System.out.println("ENTER PASSWORD CHARACTER TYPE : ");
                        String Mcharacter = sc.nextLine();

                        System.out.println("ENTER NUMBER OF PASSWORD : ");

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
