package August.day15.task;

public class NotExistIDException extends Exception{
    public NotExistIDException() {
    }

    public NotExistIDException(String message) {
        super(message);
    }
}
