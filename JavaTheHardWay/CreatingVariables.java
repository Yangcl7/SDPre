public class CreatingVariables {
  public static void main( String[] args ) {
    int x, y, age, level;
    double seconds, e, checking, speed;
    String firstName, lastName, title, sex, middlename;

    x = 10;
    y = 400;
    age = 39;
    level = 5;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    speed = 35;

    firstName = "Graham" ;
    lastName = "Mitchell";
    middlename = "John";
    title = "Mr.";
    sex = "Male";

    System.out.println( "The variable x contains " + x );
    System.out.println( "The level is " + level );
    System.out.println( "Maximum speed is 40, current speed is " +speed);
    System.out.println( "The value " + y + " is stored in the variable y." );
    System.out.println( "The experiment took " + seconds + " Seconds." );
    System.out.println( "A favorite irrational # is Euler's number: " + e );
    System.out.println( "Hopefully you have more than $" + checking + "!" );
    System.out.println( "My name's " + title +" " + firstName + " " + middlename + " " + lastName +" " + age +" " + sex);
  }
}
