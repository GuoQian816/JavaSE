/**
 * ����if��ѡ��ṹ
 * @author Administrator
 *
 */
public class TestIf {
	public static void main(String[] args){
		double d = Math.random();	//����[0,1)֮��������
		System.out.println(d);
		
		int h = (int)(6*Math.random()+1);
		System.out.println(h);
		if(h <= 3){
			System.out.println("С");
		}
		
		System.out.println("#####################");
		//ͨ�����������ӿ��������������
		int i = (int)(6 * Math.random() + 1);
		int j = (int)(6 * Math.random() + 1);
		int k = (int)(6 * Math.random() + 1);
		int count = i + j + k;
		if(count > 15){
			System.out.println("������������");
		}
		if(count >= 10 && count <=15){
			System.out.println("��������һ��");
		}
		if(count < 10){
			System.out.println("������������ô��");
		}
		
	}
}
