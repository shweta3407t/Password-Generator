package service;

import java.security.SecureRandom;

public class PasswordService {

    public static String generatePassword(Integer length, boolean u, boolean l, boolean n, boolean s) {
        while (true) {
            String uppercase = "QWERTYUIOPLKJHGFDSAZXCVBNM";

            String lowercase = "qwertyuioplkjhgfdsazxcvbnm";
            String numaric = "1234567890";
            String symbol = "!@#$%&*|{}:";
            String character = "";

            if (u) {
                character += uppercase;
            }
            if (l) {
                character += lowercase;
            }
            if (n) {
                character += numaric;
            }
            if (s) {
                character += symbol;
            }

            if (!u && !l && !n && !s) {
                System.out.println("choose at least one character");
                continue;
            }

            SecureRandom random = new SecureRandom();
            StringBuilder password = new StringBuilder();

            while (password.length() <= length) {
                if (u) {
                    int index = random.nextInt(uppercase.length());
                    password.append(uppercase.charAt(index));

                }
                if (l) {
                    int index = random.nextInt(lowercase.length());
                    password.append(lowercase.charAt(index));
                }
                if (n) {
                    int index = random.nextInt(numaric.length());
                    password.append(numaric.charAt(index));
                }
                if (s) {
                    int index = random.nextInt(symbol.length());
                    password.append(symbol.charAt(index));
                }

            }
            return password.toString();

        }
    }

    // public static void generateMultiPass(Integer length, boolean u, boolean l, boolean n, boolean s,
    //         Integer numberOfPass) {

    //     while (true) {
    //         String uppercase = "QWERTYUIOPLKJHGFDSAZXCVBNM";

    //         String lowercase = "qwertyuioplkjhgfdsazxcvbnm";
    //         String numaric = "1234567890";
    //         String symbol = "!@#$%&*|{}:";
    //         String character = "";

    //         if (u) {
    //             character += uppercase;
    //         }
    //         if (l) {
    //             character += lowercase;
    //         }
    //         if (n) {
    //             character += numaric;
    //         }
    //         if (s) {
    //             character += symbol;
    //         }

    //         if (!u && !l && !n && !s) {
    //             System.out.println("choose at least one character");
    //             continue;
    //         }
    //         SecureRandom random = new SecureRandom();
    //         StringBuilder password = new StringBuilder();
    //         while (password.length() < length) {

    //             if (u) {
    //                 int index = random.nextInt(uppercase.length());
    //                 password.append(uppercase.charAt(index));

    //             }
    //             if (l) {
    //                 int index = random.nextInt(lowercase.length());
    //                 password.append(lowercase.charAt(index));
    //             }
    //             if (n) {
    //                 int index = random.nextInt(numaric.length());
    //                 password.append(numaric.charAt(index));
    //             }
    //             if (s) {
    //                 int index = random.nextInt(symbol.length());
    //                 password.append(symbol.charAt(index));
    //             }

    //         }
    //         System.out.println("GENERATED PASSWORS" + password.toString());

    //     }
    // }

}
