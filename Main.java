import java.util.List;
import java.util.Scanner;
import java.lang.Boolean;

// assignment 1 edc
public class Main {

    public static void main(String[] args) {

    RegexEngine regex = new RegexEngine();
  
    Scanner input = new Scanner(System.in);  // Create a Scanner object
  
    String moreinp = input.nextLine();  // Read user input

    regex.input = moreinp ;

    regex.take(regex) ;


  
      // what is moreinp
      //System.out.println("what is moreinp?" + moreinp);

      // testing a single character first 

    System.out.println(regex.accept);
      
      // make sure there is a character on either side
      // make sure it doesnt take in any random shit
  
      // make the NFA based on the command
      
      // while NFA is true, keep going until expression ends 
     
    
    }
  }

