package May14.quiz1;

public class InvalidAgeException extends Exception {

  private int errorAge;

  public InvalidAgeException(int errorAge, String message) {
    super(message);
    this.errorAge = errorAge;
  }

  public int getErrorCode() {
    return errorAge;
  }
}
