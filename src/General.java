import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class General {
    public static void main(String[] args) {
        System.out.println(isGoodPW("1AaBbCc12"));
        System.out.println(isGoodPW("1aA"));
        System.out.println(isGoodPW("AAAaaaAAA"));
        System.out.println(oneMoreSolution("1AaBbCc12"));
        System.out.println(oneMoreSolution("1aA"));
        System.out.println(oneMoreSolution("AAAaaaAAA"));

    }

    private static boolean isGoodPW(String password) {
        final Pattern pattern = Pattern.compile("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,100}");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    private static boolean oneMoreSolution(String password) {
        final Pattern patternNumbers = Pattern.compile(".*\\d.*.{8,100}");
        final Pattern patternUpperLetters = Pattern.compile(".*[A-Z].*");
        final Pattern patternLowerLetters = Pattern.compile(".*[a-z].*");
        Matcher matcherNumbers = patternNumbers.matcher(password);
        Matcher matcherUpperLetters = patternUpperLetters.matcher(password);
        Matcher matcherLowerLetters = patternLowerLetters.matcher(password);
        return matcherLowerLetters.matches() && matcherUpperLetters.matches() && matcherNumbers.matches();
    }
}
