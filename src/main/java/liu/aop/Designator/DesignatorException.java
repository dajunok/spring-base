package liu.aop.Designator;

/**
 * 自定义异常类：缺勤
 * @author LIU
 *
 */
public class DesignatorException extends Exception {
	private static final long serialVersionUID = -1509272605891135841L;
	
	public DesignatorException() {
        super();
    }
	
	 public DesignatorException(String message) {
	        super(message);
	    }
	
	 public DesignatorException(String message, Throwable cause) {
	        super(message, cause);
	    }
	 
	 public DesignatorException(Throwable cause) {
	        super(cause);
	    }
	
	 protected DesignatorException(String message, Throwable cause,
             boolean enableSuppression,
             boolean writableStackTrace) {
		 super(message, cause, enableSuppression, writableStackTrace);
	 }
}
