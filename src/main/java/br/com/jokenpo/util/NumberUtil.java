package br.com.jokenpo.util;

public class NumberUtil {

    public static boolean isInteger(String value) {
        try {
            Integer.valueOf(value);
            return true;
        }catch (NumberFormatException ex) {
            return false;
        }
    }

}
