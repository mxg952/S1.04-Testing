package level1.ex1.exceptions;

public class NoFoundException extends RuntimeException {
  public NoFoundException(String message) {
    super(message);
  }
}
