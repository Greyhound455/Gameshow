// The show must go on 
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int yourChoice = 0;
    int correctChoice = 0;
    
    // "Its big brain time!"
    System.out.println("\033\143");
    System.out.println("Good morning ladies, gentlemen, and everyone in between!");
    System.out.println("I'm your host the program with no name!");
    System.out.println("Welcome to the game show where no one wins.");
    System.out.println("Press Enter to continue");

    input.nextLine();
    System.out.println("\033\143");
    System.out.println("In my program I am holding a number.");
    System.out.println("If you can guess my number you win.");
    System.out.println("But remember this is the game show where no one wins!"); 
    System.out.println("Input your guess");
    
    // Its bullying time!
    boolean run = true;
    while(run){
      try{
      yourChoice = input.nextInt();
        System.out.println("Aww good try better luck next time");
      
      run = false;
      } catch(InputMismatchException e) {
        System.out.println("\033\143");
        System.out.println("Thats unfortunate you seem to not know what a whole number is");
        System.out.println("Try again");
        input.nextLine();
      }
      correctChoice = yourChoice - 3;
      System.out.println("the correct answer is " + correctChoice);
    }
  }
}