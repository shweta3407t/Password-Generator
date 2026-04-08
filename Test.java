import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
public class Test {

    private static String rawPassword(int length, boolean u, boolean l, boolean n, boolean s  )
            throws NoSuchAlgorithmException {
        String uChars = "ABC";
        String lChars = "abc";
        String nChars = "0123";
        String sChars = "!@#$%^&*";

         

        SecureRandom random = SecureRandom.getInstanceStrong();

        String finalPass = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            if (u) {
                int rnd = random.nextInt(0, maxCharPicLength);
                char chunk = uChars.charAt(rnd);
                sb.append(chunk);
            } else if (l) {
                int rnd = random.nextInt(0, maxCharPicLength);
                char chunk = lChars.charAt(rnd);
                sb.append(chunk);
            } else if (n) {
                int rnd = random.nextInt(0, maxCharPicLength);
                char chunk = nChars.charAt(rnd);
                sb.append(chunk);
            } else if (s) {
                int rnd = random.nextInt(0, maxCharPicLength);
                char chunk = sChars.charAt(rnd);
                sb.append(chunk);
            }
        }

        return sb.toString();
    }



    public static void main(String[] args) throws NoSuchAlgorithmException {
        String pass = rawPassword(8, true, false, true, false);
        System.out.println(pass);
    }
}
