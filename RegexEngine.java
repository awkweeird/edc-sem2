import java.util.List;
import java.util.Scanner;

// assignment 1 edc
// sorry i just started
  class RegexEngine {

    String name;
    Boolean initial;
    Boolean accept;
    static List<String> inputString;
    static List<String> nextstate;
    static List<String> Epsilonnnn;

    // public static void getInput(String[] args);
    // public static void process();

    public static void main(String[] args) {

      RegexEngine regex = new RegexEngine();

      Scanner input = new Scanner(System.in);  // Create a Scanner object
  
      String moreinp = input.nextLine();  // Read user input

      if (moreinp != ""){
        regex.initial = true ;
      }

      regex.accept = true ;
      
      // make sure there is a character on either side
      // make sure it doesnt take in any random shit

      // make the NFA based on the command
      
      // while NFA is true, keep going until expression ends 

      System.out.println(regex.accept);
      
    //   inputString.add(0, userName);
    //     System.out.println("okay sure"+userName);
    }


  }

