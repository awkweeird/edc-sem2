import java.util.List;
import java.util.Scanner;
import java.lang.Boolean;

// assignment 1 edc
// expected results https://regex101.com/
// shorturl.at/eijsT // notes on regex

public class RegexEngine {

    String input;
    Boolean initial;
    Boolean accept;
    static List<String> regexString;
    static List<String> nextstate;
    static List<String> Epsilon;

    public RegexEngine() {
      input = null ;
      initial = false ;
      accept = false ;
    }


    // regex input handler
    public RegexEngine take(RegexEngine a){

      String reg = a.input ; // regex expression processing


      for (int i=0;i<reg.length();i++){
        //System.out.println("character is: " + Character.isLetter(reg.charAt(i))) ;
        if ( (!Character.isLetterOrDigit(reg.charAt(i))) ){ // https://stackoverflow.com/questions/8248277/how-to-determine-if-a-string-has-non-alphanumeric-characters
          a.initial = false ;
        }
      }

      return a;


      
    }

    // matching the input to the regex
    public Boolean accepted(RegexEngine exp, String chr){

      String reg = exp.input;
      Boolean starresult;

      // if case of STAR
      if (reg.indexOf("*")!=-1){
        starresult = exp.staraccepted(exp,chr);
        return starresult;
      } else if (reg.indexOf(chr)!=-1){ // if chr appears in reg?
        exp.accept = true;
      } else {
        exp.accept = false;
      }

      return exp.accept;

    }

    public Boolean staraccepted(RegexEngine expstar, String charstar){

      String reg = expstar.input;

      // get location of the stars
      int k=0;
      int loc=0;
      if (reg.indexOf("*")!=-1){
        k++;
        loc = reg.indexOf("*");
        // get the character before the star
        Character starred = reg.charAt(loc-1);

        // track if the character inputs by user to match regex are all the same or not
        int same=0;

        if (charstar==" "){
          expstar.accept = true;
        } else {
          for (int i=0;i<charstar.length();i++){
            if (starred==charstar.charAt(i)){
              same++;
            }
          } 
        }

        if (same==charstar.length()){
          expstar.accept = true;
        } else {
          expstar.accept = false;
        }
      }

      return expstar.accept;

    }

    public static void main(String[] args) {

      RegexEngine regex = new RegexEngine();

      Scanner input = new Scanner(System.in);  // Create a Scanner object
      String moreinp = input.nextLine();  // Read user input
    
      regex.input = moreinp;
      regex.take(regex);
      System.out.println("ready");

      

      while (true){ // keep going until user terminates

      Scanner car = new Scanner(System.in);  // Create a Scanner object
      String charinput = car.nextLine();  // Read user input

      Boolean result = regex.accepted(regex,charinput);
  
      System.out.println(result);
        
        // make sure there is a character on either side
        // make sure it doesnt take in any random shit
    
        // make the NFA based on the command
        
        // while NFA is true, keep going until expression ends 

      }

      
       
      
      }
  }

