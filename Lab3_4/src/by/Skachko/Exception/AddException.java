package by.Skachko.Exception;

public class AddException extends Exception{
    public int number;
    public AddException(String message, int number) {
        super(message);
        this.number = number;
    }
}
