/**
 * ���Է����Ļ���ʹ��
 * @author Administrator
 *
 */
public class TestMethod {
	public static void main(String[] args){
		//ͨ�����������ͨ����
		TestMethod tm = new TestMethod();
		tm.printGuoQian();
		int c = tm.add(10, 20, 30)/*ֵ���� ֵ�� ����*/ + 1000;
		System.out.println(c);
		
	}
	
	void printGuoQian(){
		System.out.println("����GuoQian");
		System.out.println("����ѧϰJavaSE");
	}
	
	int add(int a, int b, int c){
		int sum = a + b + c;
		System.out.println(sum);
		return sum;	//return���������ã�1.������������ 2.����ֵ
	}
}
