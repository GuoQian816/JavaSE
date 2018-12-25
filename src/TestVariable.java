/**
 * 测试变量
 * @author 郭茜
 *
 */
public class TestVariable {
	int a;//成员变量，成员变量会自动初始化  从属于对象
	static int size; //静态变量从属于类
	public static void main(String[] args){
		{
			int age;//只在方法块里使用
			age = 18;
		}
		
		int salary = 3000;
		int gao = 13;
		System.out.println(gao);
		
		int i;
		//int j= 5 + i;编译出错  局部变量i还未被赋值  从属于方法
	}
}
