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


      // logical operators http://www1.cs.columbia.edu/~lennox/3101-03/class1-slides/logical.html 

      for (int i=0;i<reg.length();i++){
        //System.out.println("character is: " + Character.isLetter(reg.charAt(i))) ;
        //if ( (!Character.isLetterOrDigit(reg.charAt(i))) ){ // https://stackoverflow.com/questions/8248277/how-to-determine-if-a-string-has-non-alphanumeric-characters
         //a.initial = false;
        //} else
        if ( (Character.isLetterOrDigit(reg.charAt(i))) | ((reg.charAt(i)=='|')|(reg.charAt(i)=='*')|(reg.charAt(i)=='+')|(reg.charAt(i)=='(')|(reg.charAt(i)==')') ) | ((a.input).isEmpty()) ){
          a.initial = true;
        } else {
          a.initial = false;
        }
      }

      return a;

    }

    // matching the input to the regex
    public Boolean accepted(RegexEngine exp, String chr){

      String reg = exp.input;
      Boolean starresult;
      Boolean plusresult;
      

      // if chr appears in reg?
      // if (reg.indexOf(chr)!=-1){
      //   System.out.println("hello are you running?? 3");
      //   exp.accept = true;
      // } else

      
      
      if ((reg.indexOf("*")!=-1)){ // if case of STAR
        if (chr.isEmpty()){
          return exp.accept = true;
        }
        System.out.println("hello are you running?? 2");
        starresult = exp.staraccepted(exp,chr);
        return starresult;
      } else if ((reg.indexOf("+")!=-1)){ // if case of plus
        if (chr.isEmpty()){
          return exp.accept = false;
        }
        System.out.println("hello are you running?? 1");
        plusresult = exp.plusaccepted(exp,chr);
        return plusresult;
      } else if (reg.contains(chr)){
        System.out.println("hello are you running?? 4");
        exp.accept=true;
      }
      
      else
      
      {
        exp.accept = false;
      }

      
    
      return exp.accept;

    }

    public Boolean staraccepted(RegexEngine expstar, String charstar){

      String reg = expstar.input;

      // get location of the stars
      int loc=0;
      loc = reg.indexOf("*");

      // if (charstar.isEmpty()){
      //   expstar.accept = true;
      // }
      
        // get the character before the star
      Character starred = reg.charAt(loc-1);


      // case 1: a*b , aaaaaaaa , " "

      // track if the character inputs by user to match regex are all the same or not
      int same=0;


      for (int i=0;i<charstar.length();i++){
        if (starred==charstar.charAt(i)){
          same++;
        }
      }

      // get character afterstar
      Character afterstar = reg.charAt(loc+1);
      String charcompare = new StringBuilder().append(starred).append(afterstar).toString(); // new string made from the two chars

      //System.out.println("charcompare: "+charcompare);


      if (same==charstar.length()){
        expstar.accept = true;
      }
      else {
        expstar.accept = false;
      }

      //case 2: aaaaab baaaab

      if (charstar.contains(charcompare)){
        expstar.accept = true;
      } else {
        expstar.accept = false;
      }

      return expstar.accept;

    }

    public Boolean plusaccepted(RegexEngine expplus, String charplus){
      String reg = expplus.input;

      // get location of plus
      int loc=0;
      loc = reg.indexOf('+');

      // get char before the plus
      Character plus = reg.charAt(loc-1);

      // track if the character inputs by user to match regex are all the same or not
      int same=0;

      
      if (charplus!=null){
        if (plus == charplus.charAt(0)){
          System.out.println("are you running? 1");
          expplus.accept = true;
        }

      } else
      
      // if (charplus.isEmpty()){
        
      //   expplus.accept = false;
      // }else
      
      {
        for (int i=0;i<charplus.length();i++){
          if (plus==charplus.charAt(i)){
            same++;
          }
        } 
      }

      // get character afterstar
      Character afterplus = reg.charAt(loc+1);
      String charcompare = new StringBuilder().append(plus).append(afterplus).toString(); // new string made from the two chars


      if (same==charplus.length()){
        System.out.println("are you running? 2");
        expplus.accept = true;
      }
      else {
        expplus.accept = false;
      }

      //case 2: aaaaab baaaab

      if (charplus.contains(charcompare)){
        System.out.println("are you running? 3");
        expplus.accept = true;
      } else {
        expplus.accept = false;
      }



      return expplus.accept;
    }

    public static void main(String[] args) {

      RegexEngine regex = new RegexEngine();

      Scanner input = new Scanner(System.in);  // Create a Scanner object
      String moreinp = input.nextLine();  // Read user input

      Boolean cont;
    
      regex.input = moreinp;
      regex.take(regex);

      if (regex.initial == false){

        System.out.println("ERROR");
        cont = false;
      } else {
        System.out.println("ready");
        cont = true;
      }
      

      

      while (cont){ // keep going until user terminates

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

