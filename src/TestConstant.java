/**
 * 测试常量
 * @author 郭茜
 *
 */
public abstract class TestConstant {
	public static void main(String[] args){
		
		int age = 18;
		final String MY_NAME = "GUOQIAN";//常量命名要全部大写用下划线隔开单词
		//String = "GAOQI";//final修饰变量变为常量不能再被赋值
		final double PI = 3.14;
		double r = 4;
		double area = PI*r*r;
		double circle = 2*PI*r;
		System.out.println(area);
		System.out.println(circle);
		
				
		
	}

}
