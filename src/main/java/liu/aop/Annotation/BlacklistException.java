package liu.aop.Annotation;

/**
 * 黑名单异常类：自定义异常，用于测试AspectJ异常通知
 * @author LIU
 *
 */
public class BlacklistException extends Exception {
	
	private static final long serialVersionUID = -1820562072308024816L;

	public BlacklistException() {
        super();
    }
	
	 public BlacklistException(String message) {
	        super(message);
	    }
	
	 public BlacklistException(String message, Throwable cause) {
	        super(message, cause);
	    }
	 
	 public BlacklistException(Throwable cause) {
	        super(cause);
	    }
	
	 protected BlacklistException(String message, Throwable cause,
             boolean enableSuppression,
             boolean writableStackTrace) {
		 super(message, cause, enableSuppression, writableStackTrace);
	 }
}
