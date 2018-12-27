/**
 * 测试递归
 * @author Administrator
 *
 */
public class TestRecursion01 {
	public static void main(String[] args){
		long d1 = System.currentTimeMillis();
		System.out.printf("%d阶乘的结果：%s%n",  10, factorial(10));
		long d2 = System.currentTimeMillis();
		System.out.printf("递归费时：%s%n", d2-d1);	
		long d3 = System.currentTimeMillis();
		int a = 10;
		long result = 1;
		while(a > 1){
			result *= a * (a-1);
			a -=2;
		}
		long d4 = System.currentTimeMillis();
		System.out.printf("阶乘的循环结果：%s%n", result);
		System.out.printf("普通循环费时：%s%n", d4 - d3);
		
	}
	/**
	 * 递归求阶乘的方法
	 */
	static long factorial(int n){
		if(n==1){	//递归头
			return 1;
		}else{	//递归体
			return n*factorial(n-1);	//n! = n * (n-1)!
		}
	}
}
