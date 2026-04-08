package service;

 import java.security.SecureRandom;

;

public class PasswordService {

    public static void generatePassword(Integer length, String character) {
        String uppercase = "QWERTYUIOPLKJHGFDSAZXCVBNM";
        String lowercase = "qwertyuioplkjhgfdsazxcvbnm";
        String numaric = "1234567890";
        String symbol = "!@#$%^&*";
        String all= "QWERTYUIOPLKJHGFDSAZXCVBNM"+"qwertyuioplkjhgfdsazxcvbnm"+"1234567890"+"!@#$%^&*";
        

        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            if (character.contains("u")) {

                int index = random.nextInt(uppercase.length());
                sb.append( uppercase.charAt( index));

            } else if (character.contains("l")) {
                int index = random.nextInt(lowercase.length());
                sb.append( lowercase.charAt( index));
            } else if (character.contains("n")) {
                int index = random.nextInt(numaric.length());
                sb.append( numaric.charAt( index));
            } else if (character.contains("s")) {
                int index = random.nextInt(symbol.length());
                sb.append( symbol.charAt(index ));
            }

            else if(character.contains( "ulns")){
                int index= random.nextInt(all.length());
                sb.append(all.charAt(index));
            }
        }
        System.out.println("password : "+sb);

    }

    public static void generatePassword(Integer length, String character, String numberOfPassword) {

    }
 
}
