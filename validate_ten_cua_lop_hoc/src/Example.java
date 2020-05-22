import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {

    private static final String REGEX = "^[CAP]\b\\d{4}[GHIKML]$";

    public boolean validate (String regex){
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

class Test{
    private static Example example;

    public static void main(String[] args) {
    example = new Example();
    String test = "C0320H";
    boolean check = example.validate(test);
        System.out.println(check);

    }
}
