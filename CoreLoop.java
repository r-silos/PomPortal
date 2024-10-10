import java.text.MessageFormat;
import java.time.LocalDate;

public class CoreLoop{
    public static void main(String[] args) {
        System.out.println("this is a test");
        LocalDate todayDate= LocalDate.now();
        System.out.println(todayDate);
        System.out.println(MessageFormat.format("todays date is {0}", todayDate.toString()));
    }
}