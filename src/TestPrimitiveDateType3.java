/**
 * �����ַ����ͺͲ�������
 * @author Administrator
 *
 */
public class TestPrimitiveDateType3 {
	public static void main(String[] args){
		
		//�����ַ�����  2byte 
		char a = 'a';
		char b = '��';
		char c = '\u0061';
		System.out.println(c);
		
		//ת���ַ�
		System.out.println(""+'a' +'\n'+'b');
		System.out.println(""+'a' +'\t'+'b');
		System.out.println(""+'a'+'\''+'b');
		
		//�ַ��� 
		String d = "abc";
		
		//���Բ������� 1bit ���������ֱ�ʾ
		boolean man = true;
		if(man){ //��Ҫдman==true less is more
			System.out.println("����");
		}
	}
}
