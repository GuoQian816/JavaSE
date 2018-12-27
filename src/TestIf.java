/**
 * 测试if单选择结构
 * @author Administrator
 *
 */
public class TestIf {
	public static void main(String[] args){
		double d = Math.random();	//返回[0,1)之间的随机数
		System.out.println(d);
		
		int h = (int)(6*Math.random()+1);
		System.out.println(h);
		if(h <= 3){
			System.out.println("小");
		}
		
		System.out.println("#####################");
		//通过掷三个骰子看看今天手气如何
		int i = (int)(6 * Math.random() + 1);
		int j = (int)(6 * Math.random() + 1);
		int k = (int)(6 * Math.random() + 1);
		int count = i + j + k;
		if(count > 15){
			System.out.println("今天手气不错");
		}
		if(count >= 10 && count <=15){
			System.out.println("今天手气一般");
		}
		if(count < 10){
			System.out.println("今天手气不怎么样");
		}
		
	}
}
