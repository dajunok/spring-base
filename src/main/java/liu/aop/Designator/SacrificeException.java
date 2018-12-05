package liu.aop.Designator;

/**
 *自定义异常：牺牲
 * @author LIU
 *
 */
public class SacrificeException extends Exception {
	private static final long serialVersionUID = -1509272605891135841L;
	
	public SacrificeException() {
        super();
    }
	
	 public SacrificeException(String message) {
	        super(message);
	    }
	
	 public SacrificeException(String message, Throwable cause) {
	        super(message, cause);
	    }
	 
	 public SacrificeException(Throwable cause) {
	        super(cause);
	    }
	
	 protected SacrificeException(String message, Throwable cause,
             boolean enableSuppression,
             boolean writableStackTrace) {
		 super(message, cause, enableSuppression, writableStackTrace);
	 }
}
