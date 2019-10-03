package ExceptionHandling;

public class AgeException extends Exception {
        AgeException(){}

        AgeException( String messsage ) {
            super(messsage);
            System.out.println( "Age is not enough to Vote");
        }
    }