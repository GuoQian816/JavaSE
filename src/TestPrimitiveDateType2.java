import java.math.*;
/**
 * 测试浮点型
 * @author Administrator
 *
 */
public class TestPrimitiveDateType2 {
	public static void main(String[] args){
		
		float a = 3.14F;//小数默认类型是double
		double b = 6.28;
		double c = 628E-2;
		System.out.println(c);
		
		//浮点数是不精确的  不能用于比较
		float f = 0.1f;
		double d = 1.0/10;
		System.out.println(f==d);	//结果为false
		
		float d1 = 423432423F;
		float d2 = d1 + 1;
		if(d1==d2){
			System.out.println("d1==d2");
		}else{
			System.out.println("d1!=d2");
		}
		
		System.out.println("####################################");
		//想比较浮点数用Jjava.math里的两个有用类BigInteger和BigDecimal
		BigDecimal bd = BigDecimal.valueOf(1.0);
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		System.out.println(bd);	//0.5
		System.out.println(1.0-0.1-0.1-0.1-0.1-0.1); //0.500000000001
		
		BigDecimal bd2 = BigDecimal.valueOf(0.1);
		BigDecimal bd3 = BigDecimal.valueOf(1.0/10.0);
		System.out.println(bd2.equals(bd3));
		
		
		
	}

}
