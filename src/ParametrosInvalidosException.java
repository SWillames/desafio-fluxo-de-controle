public class ParametrosInvalidosException extends Exception{

  private static final long serialVersionUID = 3549520983273423322L;

  public ParametrosInvalidosException(String msg) {
    super(msg);
  }

  public ParametrosInvalidosException(String msg, Throwable cause ) {
    super(msg, cause);
  }
}
