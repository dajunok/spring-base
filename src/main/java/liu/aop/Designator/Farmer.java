package liu.aop.Designator;
/**
 * 农民：
 * @author LIU
 * 
 * Farmer：农民
 * Countryside：农村
 * cultivate：种地
 */
public class Farmer implements Countryside{

	@Override
	public void cultivate() {  
		System.out.println("作为农民要辛辛苦苦种地......");		
	}

}
