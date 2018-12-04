package liu.aop.Annotation;

/**
 * 账户异常类：自定义异常，用于测试AspectJ异常通知
 * @author LIU
 *
 */
public class AccountException extends Exception {
	private static final long serialVersionUID = -1509272605891135841L;
	
	public AccountException() {
        super();
    }
	
	 public AccountException(String message) {
	        super(message);
	    }
	
	 public AccountException(String message, Throwable cause) {
	        super(message, cause);
	    }
	 
	 public AccountException(Throwable cause) {
	        super(cause);
	    }
	
	 protected AccountException(String message, Throwable cause,
             boolean enableSuppression,
             boolean writableStackTrace) {
		 super(message, cause, enableSuppression, writableStackTrace);
	 }
}
