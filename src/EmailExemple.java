import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExemple {
    private static Pattern pattern;
    private static Matcher matcher;

    private static final String EMAIL_REGEX = "^\\w+\\w*@\\w+(\\.\\w+)$";

    public EmailExemple(){
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
