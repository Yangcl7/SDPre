import java.util.Scanner;

public class RudeQuestions {
  public static void main( String[] args ) {
    String name;
    int age;
    double weight, income, height;

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Hello. What is your name? " );
    name = keyboard.next();

    System.out.println( "Hi, " + name + "! How old are you? " );
    age = keyboard.nextInt();

    System.out.println( "So you're " + age + ", eh? That's not very old." );
    System.out.println( "How much do you weigh, " + name + "? " );
    weight = keyboard.nextDouble();

    System.out.println( weight + "! Better keep that quiet!!" );
    System.out.print(" Finally, what's your income, " + name + "? " );
    income = keyboard.nextDouble();

    System.out.print("Hopefully that is " + income + " per hour" );
    System.out.println( " and not per year!" );
    System.out.print( " Well, thanks for answering my rude questions, " );
    System.out.println( name + ". "  );

    System.out.println( "And one more question, what's your height? ");
    height = keyboard.nextDouble();

    System.out.println(+height +"eh?" );
    System.out.println(" can you dunk being " +height + "tall?");
    // Putting a integer when it is expecting a double will blow up I think because integer cant be with desmos.
    // It didn't blow up when enter a integer or double when it is expecting a String, I think it's because String can be all.
    //
    }
}
