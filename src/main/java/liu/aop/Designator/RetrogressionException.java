package liu.aop.Designator;

/**
 * 自定义异常类：学习退步
 * @author LIU
 *
 */
public class RetrogressionException extends Exception {
	private static final long serialVersionUID = -1509272605891135841L;
	
	public RetrogressionException() {
        super();
    }
	
	 public RetrogressionException(String message) {
	        super(message);
	    }
	
	 public RetrogressionException(String message, Throwable cause) {
	        super(message, cause);
	    }
	 
	 public RetrogressionException(Throwable cause) {
	        super(cause);
	    }
	
	 protected RetrogressionException(String message, Throwable cause,
             boolean enableSuppression,
             boolean writableStackTrace) {
		 super(message, cause, enableSuppression, writableStackTrace);
	 }
}
