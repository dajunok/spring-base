package liu.aop.Designator;

/**
 * 自定义异常：生病
 * @author LIU
 *
 */
public class FallillException extends Exception {
	private static final long serialVersionUID = -1509272605891135841L;
	
	public FallillException() {
        super();
    }
	
	 public FallillException(String message) {
	        super(message);
	    }
	
	 public FallillException(String message, Throwable cause) {
	        super(message, cause);
	    }
	 
	 public FallillException(Throwable cause) {
	        super(cause);
	    }
	
	 protected FallillException(String message, Throwable cause,
             boolean enableSuppression,
             boolean writableStackTrace) {
		 super(message, cause, enableSuppression, writableStackTrace);
	 }
}
