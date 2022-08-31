import java.util.List;
import java.util.Scanner;
import java.lang.Boolean;

// assignment 1 edc
public class RegexEngine {

    String input;
    String character; 
    Boolean initial;
    Boolean accept;
    static List<String> regexString;
    static List<String> nextstate;
    static List<String> Epsilon;

    public RegexEngine() {
      input = null ;
      character = null ;
      initial = false ;
      accept = false ;
    }


    // regex input handler
    public RegexEngine take(RegexEngine a){

      String reg = a.input ;

      if (reg.equals("a")){
        a.initial = true ;
      } else {
        a.accept = false ; 
      }

      if (a.initial){
        a.accept = true ;
      }


      for (int i=0;i<reg.length();i++){
        //System.out.println("character is: " + Character.isLetter(reg.charAt(i))) ;
        if (!Character.isLetter(reg.charAt(i))){
          a.accept = false ;
        }
      }

      return a;

      // // brackets
      // int bracket1 = (a.input).indexOf("(");
      // int bracket2 = (a.input).indexOf(")");

      // //alternation
      // int alt = (a.input).indexOf("|");
      // // repetition
      // int rep = (a.input).indexOf("*");

      // String reg = a.input;
 
      // // Switch statement over above string
      // switch (reg) {

      // // Case 1
      // case "one":

      //     // Print statement corresponding case
      //     System.out.println("one");

      //     // break keyword terminates the
      //     // code execution here itself
      //     break;

      // // Case 2
      // case "two":

      //     // Print statement corresponding case
      //     System.out.println("two");
      //     break;

      // // Case 3
      // case "three":

      //     // Print statement corresponding case
      //     System.out.println("three");
      //     break;

      // // Case 4
      // // Default case
      // default:

      //     // Print statement corresponding case
      //     System.out.println("no match");


      
    }

    // inputted character handler
    // public void character(String haha){



    // }

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
  
      System.out.println(regex.accept);
        
        // make sure there is a character on either side
        // make sure it doesnt take in any random shit
    
        // make the NFA based on the command
        
        // while NFA is true, keep going until expression ends 

      }

      
       
      
      }
  }

