/**
 * ����ǿ������ת���ͳ�������
 * @author Administrator
 *
 */
public class TestTypeConvertError {
	public static void main(String[] args){
		int money = 1000000000;	//10��  int����12��
		int year = 20;
		int total = money*year;
		System.out.println(total);
		//����total�Ǹ���������int�ķ�Χ
		long total1 = money*year;
		System.out.println(total1);
		//����total1���Ǹ��� ��Ĭ����int����˽����תΪintֵ��תΪlongֵ�������Ѿ������ı�
		long total2 = ((long)money)*year;
		System.out.println(total2);
		//����Total2��ȷ  �Ƚ�һ�����ӱ�Ϊlong �������ʽ�������� ȫ����long������
		
		long total3 = 34L*3223*year*223423;	//��ֹ����׸�����ת��Ϊlong����
		System.out.println(total3);
		
		//��������  ��Ҫ��СдL������1����
		int l = 2;
		long a = 23451l;
		System.out.println(l+1);
	
		
	}
}
