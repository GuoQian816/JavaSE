/**
 * ����switch���
 * ������ֵ�жϵ�ʱ��ʹ��switch���.��Ȼ��switch��ȫ����ʹ��if else if else����
 * @author Administrator
 *
 */
public class TestSwitch {
	public static void main(String[] args){
		int month = (int)(1 + 12 *Math.random());
		System.out.println("�·�" + month);
		
		switch(month){
		case 1:
			System.out.println("һ�·� ����������");
		break;
		case 2:
			System.out.println("���·ݣ�������");
		break;
		default:
			System.out.println("���������·�");
		break;
		}
		
		System.out.println("######################");
		
		char c = 'a';
		int rand = (int) (26 * Math.random());
		char c2 = (char) (c + rand);
		System.out.print(c2 + ":");
		switch(c2){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Ԫ��");
			break;
		default:
			System.out.println("����");
		
		
		}
	}
}
