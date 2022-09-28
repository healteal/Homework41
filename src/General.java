import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class General {
    public static void main(String[] args) {
        System.out.println(isGoodPW("AaBbCc12"));
        System.out.println(isGoodPW("1aA"));
        System.out.println(isGoodPW("AAAaaaAAA"));
    }

    private static boolean isGoodPW(String password) {
        final Pattern pattern = Pattern.compile("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,100}");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
