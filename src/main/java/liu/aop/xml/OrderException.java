package liu.aop.xml;

/**
 * 订单异常类：自定义异常，用于测试AspectJ异常通知
 * @author LIU
 *
 */
public class OrderException extends Exception {
	private static final long serialVersionUID = -1509272605891135841L;
	
	public OrderException() {
        super();
    }
	
	 public OrderException(String message) {
	        super(message);
	    }
	
	 public OrderException(String message, Throwable cause) {
	        super(message, cause);
	    }
	 
	 public OrderException(Throwable cause) {
	        super(cause);
	    }
	
	 protected OrderException(String message, Throwable cause,
             boolean enableSuppression,
             boolean writableStackTrace) {
		 super(message, cause, enableSuppression, writableStackTrace);
	 }
}
