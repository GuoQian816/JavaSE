/**
 * λ�����
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
		
		//��λ
		int c = 3<<2; //�����൱�ڳ�2 3<<2 �൱��3*2*2
		System.out.println(c);
		System.out.println(c>>1);//�����൱�ڳ�2 12>>2�൱��12/2
	}
}
