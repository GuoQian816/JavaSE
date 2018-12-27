/**
 * 测试while循环
 * @author Administrator
 *
 */
public class TestWhille {
	public static void main(String[] args){
		//计算1加到100的和
		int i = 1;
		int sum = 0;
		
		while(i<=100){
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
	}
}
