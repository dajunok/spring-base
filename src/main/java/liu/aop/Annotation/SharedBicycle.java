package liu.aop.Annotation;

/**
 * 共享单车
 * @author LIU
 *
 */
public class SharedBicycle {
	private String bicycleID;  //共享单车编号
	private Integer lockStatus;    //锁状态：0,锁住状态；1，打开状态	
	
	public SharedBicycle(String bicycleID, int lockStatus) {
		super();
		this.bicycleID = bicycleID;
		this.lockStatus = lockStatus;
	}

	public Integer qrCodeScan(String bran,String manufactor) throws BlacklistException {  //共享单车扫二维码开锁骑行,传入参数：qrCodeScan（品牌，厂家）
		if(bran=="mobike") {
			throw new BlacklistException("黑名单异常");
		}
		this.lockStatus=1;
		System.out.println("共享单车品牌："+bran+"   "+"共享单车厂家： "+manufactor);
		return this.lockStatus;
	}
	

	public String getBicycleID() {
		return bicycleID;
	}

	public int getLockStatus() {
		return lockStatus;
	}

}
