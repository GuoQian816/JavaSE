/**
 * ����Ƕ��ѭ��
 * @author Administrator
 *
 */
public class TestWhileNestification 
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i+"\t");
			}
			System.out.println();
		}
		
		//��ӡ�žų˷���
		for(int n=1; n<=9; n++)
		{
			for(int m=1; m<=n; m++)
			{
				System.out.print(m + "*" + n + "="+ n*m +"\t"+"\t");
			}
			System.out.println();
		}
		
		//��ӡ100����������ż����
		int sumOdd = 0;
		int sumOven = 0;
		for(int i=0;i<=100;i++)
		{
			if(i%2==0)
			{
				sumOven += i;
			}else
			{
				sumOdd += i;
			}
		}
		System.out.println("sumOdd = "+ sumOdd);
		System.out.println("sumOven = "+ sumOven);
		
		//��ѭ�����1-1000֮���ܱ�5������������ÿ�����5��
		int tag = 0;
		for(int i=1;i<=1000;i++)
		{
			if(i%5==0)
			{
				System.out.print(i+"\t");
				tag++;
			}
			//if i%25==0 ����
			if(tag==5){
				System.out.println();
				tag = 0;
			}
		}
		
		
	}
}
