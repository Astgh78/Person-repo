package Core.exceptions;

public class InvalidLastNameException extends RuntimeException{
    public InvalidLastNameException (String ms)
    {
        super(ms);
    }

    public InvalidLastNameException() {

    }
}
