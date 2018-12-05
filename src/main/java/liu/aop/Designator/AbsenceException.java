package liu.aop.Designator;

/**
 * 自定义异常类：缺勤
 * @author LIU
 *
 */
public class AbsenceException extends Exception {
	private static final long serialVersionUID = -1509272605891135841L;
	
	public AbsenceException() {
        super();
    }
	
	 public AbsenceException(String message) {
	        super(message);
	    }
	
	 public AbsenceException(String message, Throwable cause) {
	        super(message, cause);
	    }
	 
	 public AbsenceException(Throwable cause) {
	        super(cause);
	    }
	
	 protected AbsenceException(String message, Throwable cause,
             boolean enableSuppression,
             boolean writableStackTrace) {
		 super(message, cause, enableSuppression, writableStackTrace);
	 }
}
