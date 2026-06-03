package service;

import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordService {

    public static void includeCharacter(Scanner sc, Integer length) {

        System.out.print("\ninclide uppercase ? (y/n): ");
        boolean u = sc.nextLine().equalsIgnoreCase("y");

        System.out.print("include lowercase ? (y/n) : ");
        boolean l = sc.nextLine().equalsIgnoreCase("y");

        System.out.print("include number ? (y/n) : ");
        boolean n = sc.nextLine().equalsIgnoreCase("y");

        System.out.print("inclide symbol ? (y/n) : ");
        boolean s = sc.nextLine().equalsIgnoreCase("y");

        if (!u && !l && !n && !s) {
            System.out.println("CHOOSE AT LEAST ON CHARACTER ");
            includeCharacter(sc, length);

        }

        String pass = service.PasswordService.generatePassword(length, u, l, n, s);

        System.out.println("GENERATED PASSWORD : " + pass);

        return;
    }

    public static void includeCharacter(Scanner sc, Integer length, Integer numOfpass) {

        System.out.print("\ninclide uppercase ? (y/n): ");
        boolean u = sc.nextLine().equalsIgnoreCase("y");

        System.out.print("include lowercase ? (y/n) : ");
        boolean l = sc.nextLine().equalsIgnoreCase("y");

        System.out.print("include number ? (y/n) : ");
        boolean n = sc.nextLine().equalsIgnoreCase("y");

        System.out.print("inclide symbol ? (y/n) : ");
        boolean s = sc.nextLine().equalsIgnoreCase("y");

        if (!u && !l && !n && !s) {
            System.out.println("CHOOSE AT LEAST ON CHARACTER ");
            includeCharacter(sc, length);

        }

        for (int i = 1; i <= numOfpass; i++) {
            String pass = service.PasswordService.generatePassword(length, u, l, n, s);

            System.out.println(i + ". GENERATED PASSWORD : " + pass);
        }

    }

    public static String generatePassword(Integer length, boolean u, boolean l, boolean n, boolean s) {

        String uppercase = "QWERTYUIOPLKJHGFDSAZXCVBNM";

        String lowercase = "qwertyuioplkjhgfdsazxcvbnm";
        String numaric = "1234567890";
        String symbol = "!@#$%&*|{}:";

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        while (password.length() < length) {
            if (u) {
                int index = random.nextInt(uppercase.length());
                char c = uppercase.charAt(index);
                password.append(c);
                if (password.length() == length)
                    break;

            }
            if (l) {
                int index = random.nextInt(lowercase.length());
                password.append(lowercase.charAt(index));
                if (password.length() == length)
                    break;
            }
            if (n) {
                int index = random.nextInt(numaric.length());
                password.append(numaric.charAt(index));
                if (password.length() == length)
                    break;
            }
            if (s) {
                int index = random.nextInt(symbol.length());
                password.append(symbol.charAt(index));
                if (password.length() == length)
                    break;
            }
        }

        return password.toString();

    }
}
