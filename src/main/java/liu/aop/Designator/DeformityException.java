package liu.aop.Designator;

/**
 * 自定义异常类：残疾
 * @author LIU
 *
 */
public class DeformityException extends Exception {
	private static final long serialVersionUID = -1509272605891135841L;
	
	public DeformityException() {
        super();
    }
	
	 public DeformityException(String message) {
	        super(message);
	    }
	
	 public DeformityException(String message, Throwable cause) {
	        super(message, cause);
	    }
	 
	 public DeformityException(Throwable cause) {
	        super(cause);
	    }
	
	 protected DeformityException(String message, Throwable cause,
             boolean enableSuppression,
             boolean writableStackTrace) {
		 super(message, cause, enableSuppression, writableStackTrace);
	 }
}
