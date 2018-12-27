/**
 * 测试continue
 * @author Administrator
 *
 */
public class TestContinue {
	public static void main(String[] args){
		//把100-150之间不能被3整除的数，并且每行输出5个
		int count = 0;	//定义计数器
		for(int i=100; i<=150; i++){
			if(i%3==0){
				continue;
			}
			System.out.print(i + "`");
			count++;
			if(count%5==0){
				System.out.println();
			}
		}
		
	}
	
	

}
