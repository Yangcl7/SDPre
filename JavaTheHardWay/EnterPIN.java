import java.util.Scanner;

public class EnterPIN {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int pin, enter;
    String password;

    System.out.println("WELCOME TO THE BANK OF JAVA.");
    System.out.println("PLEASE ENTER YOUR PASSWORD: ");
    password = keyboard.next();

    while (! password.equals("youngIscool78") ) {
      System.out.println("\nINCORRECT PASSWORD. TRY AGAIN. ");
      System.out.println("ENTER YOUR PASSWORD: ");
      password = keyboard.next();
    }

    pin = 12345;

    System.out.print("ENTER YOUR PIN: ");
    enter = keyboard.nextInt();

    while ( enter != pin ) {
      System.out.println("\nINCORRECT PIN.  TRY AGAIN. ");
      System.out.print("ENTER YOUR PIN: ");
      enter = keyboard.nextInt();
    }

    System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
  }
}
