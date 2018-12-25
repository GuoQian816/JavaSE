/**
 * 位运算符
 * @author Administrator
 *
 */
public class TestOperator04 {
	public static void main(String[] args){
		int a = 3;	//0011
		int b = 4;	//0100
		System.out.println(a&b);	//0000
		System.out.println(a|b);	//0111
		System.out.println(a^b);	//0111
		System.out.println(~a);		//1100
		
		//移位
		int c = 3<<2; //左移相当于乘2 3<<2 相当于3*2*2
		System.out.println(c);
		System.out.println(c>>1);//右移相当于除2 12>>2相当于12/2
	}
}
