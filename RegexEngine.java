import java.util.List;
import java.util.Scanner;
import java.lang.Boolean;

// assignment 1 edc
public class RegexEngine {

    String input;
    Boolean initial;
    Boolean accept;
    static List<String> inputString;
    static List<String> nextstate;
    static List<String> Epsilon;

    public RegexEngine() {
      input = null ;
      initial = false ;
      accept = false ;
    }

    public RegexEngine take(RegexEngine a){

      if ((a.input).equals("a")){
        a.initial = true ;
        // is this working?
      } else {
        a.accept = false ; 
      }

      if (a.initial){
        a.accept = true ;
      } else {
        a.accept = false ;
      }

      return a;
      
    }
  }

