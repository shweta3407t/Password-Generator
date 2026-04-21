package utils;

public class InputValidator {

    public static boolean isEmpty(String choice) {
        if (choice.isEmpty() || choice.isBlank()) {
            System.out.println("CHOICE SHOULD NOT BE EMPTY.");
            return false;
        }
        return true;
    }

}
