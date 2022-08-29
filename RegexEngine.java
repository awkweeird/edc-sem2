import java.util.List;
import java.util.Scanner;
import java.lang.Boolean;

// assignment 1 edc
// sorry i just started
public class RegexEngine {

    String name;
    Boolean initial;
    Boolean accept;
    static List<String> inputString;
    static List<String> nextstate;
    static List<String> Epsilon;

    public RegexEngine() {
      initial = false ;
      accept = false ;
    }

    public static void main(String[] args) {

      RegexEngine regex = new RegexEngine();
  
      Scanner input = new Scanner(System.in);  // Create a Scanner object
  
      String moreinp = input.nextLine();  // Read user input
  
      // what is moreinp
      //System.out.println("what is moreinp?" + moreinp);

      // testing a single character first 


      if (moreinp.equals("a")){
        regex.initial = true ;
        // is this working?
      }

      if (regex.initial){
        regex.accept = true ;
      }

      System.out.println(regex.accept);
      
      // make sure there is a character on either side
      // make sure it doesnt take in any random shit
  
      // make the NFA based on the command
      
      // while NFA is true, keep going until expression ends 
    
    }
  }

