/**
 * 测试方法重载
 * @author Administrator
 *
 */
public class TestOverload {
	public static void main(String[] args){
		System.out.println(add(3, 5));
		System.out.println(add(3, 4, 5));
		System.out.println(add(3.0, 5));
		System.out.println(add(3, 5.0));
		//我们已经见过的重载
		System.out.println();//0个参数
		System.out.println(1);//1个int参数
		System.out.println(3.0);//1个double参数
	}
	/**
	 * 求和的方法
	 */
	public static/*引用时不用new一个对象*/ int add(int n1, int n2){
		int sum = n1 + n2;
		return sum;
	}
	//方法名相同，参数个数不同，构成重载
	public static int add(int n1, int n2, int n3){
		int sum = n1 + n2 + n3;
		return sum;
	}
	//方法名相同，参数类型不同，构成重载
	public static double add(double n1, int n2){
		double sum = n1 + n2;
		return sum;
	}
	//方法名相同，参数顺序不同，构成重载
	public static double add(int n1, double n2){
		double sum = n1 + n2;
		return sum;
	}
	//方法名相同，参数名字不同，不构成重载
	/*
	public static int add(int n3, int n4){
		int sum = n3 + n4;
		return sum;
	}
	*/
	
	//方法名相同，返回值类型不同，不构成重载
	/*
	public static double add(int n2, int n1){
		double sum = n2 + n1;
		return sum;
	}
	*/


}
