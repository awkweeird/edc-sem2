import java.beans.Transient;
import static org.junit.Assert.assertEquals;
//import "RegexEngine.java" ;
//import org.junit.Test;

public class Regex_Test{
    @Test
    public static void main(String[] args) {
        RegexEngine regextest = new RegexEngine();
        regextest.input = "b";
        RegexEngine regexresult = regextest.take(regextest);
        assertEquals(false, regexresult.accept);
      }
}