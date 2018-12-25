/**
 * 测试算术运算符
 * @author Administrator
 *
 */
public class TestOperator01 {
	public static void main(String[] args){
		
		//测试算术运算符
		byte a = 1;
		int b = 2;
		long b2 = 3;
		//byte c = a + b;	//没有long时结果为int 即使操作数全为short byte 结果也是int
		//int c2 = b2 + b;	//有long结果为long类型
		
		float f1 = 3.14F;
		float d = b + b2;	 //表述范围较大可以自动转化		
		//float d2 = 3.14 + f1;		//只要一个数为double结果为double
		
		//取模运算 符号和左边相同
		System.out.println(-9%5);
		
		
		//测试自增和自减
		int e = 3;
		int f = e++;	//执行后 f=3,先给f赋值,e再自增
		System.out.println("e="+e+"\nf="+f);
		e = 3;
		f = ++e;	//执行后f=4，e先自增 ,再给f赋值
		System.out.println("e="+e+"\nf="+f);
		
		
		//测试赋值及其扩展运算符
		int g = 3;
		int h = 4;
		g += h;	//相当于a=a+b
		System.out.println(g);
		g = 3;
		g *= h + 3;	//相当于a=a*(b+3)
		System.out.println(g);
		
		
	}

}
