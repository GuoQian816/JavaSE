/**
 * �������������
 * @author Administrator
 *
 */
public class TestOperator01 {
	public static void main(String[] args){
		
		//�������������
		byte a = 1;
		int b = 2;
		long b2 = 3;
		//byte c = a + b;	//û��longʱ���Ϊint ��ʹ������ȫΪshort byte ���Ҳ��int
		//int c2 = b2 + b;	//��long���Ϊlong����
		
		float f1 = 3.14F;
		float d = b + b2;	 //������Χ�ϴ�����Զ�ת��		
		//float d2 = 3.14 + f1;		//ֻҪһ����Ϊdouble���Ϊdouble
		
		//ȡģ���� ���ź������ͬ
		System.out.println(-9%5);
		
		
		//�����������Լ�
		int e = 3;
		int f = e++;	//ִ�к� f=3,�ȸ�f��ֵ,e������
		System.out.println("e="+e+"\nf="+f);
		e = 3;
		f = ++e;	//ִ�к�f=4��e������ ,�ٸ�f��ֵ
		System.out.println("e="+e+"\nf="+f);
		
		
		//���Ը�ֵ������չ�����
		int g = 3;
		int h = 4;
		g += h;	//�൱��a=a+b
		System.out.println(g);
		g = 3;
		g *= h + 3;	//�൱��a=a*(b+3)
		System.out.println(g);
		
		
	}

}
