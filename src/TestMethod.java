/**
 * 测试方法的基本使用
 * @author Administrator
 *
 */
public class TestMethod {
	public static void main(String[] args){
		//通过对象调用普通方法
		TestMethod tm = new TestMethod();
		tm.printGuoQian();
		int c = tm.add(10, 20, 30)/*值传递 值的 拷贝*/ + 1000;
		System.out.println(c);
		
	}
	
	void printGuoQian(){
		System.out.println("我是GuoQian");
		System.out.println("我在学习JavaSE");
	}
	
	int add(int a, int b, int c){
		int sum = a + b + c;
		System.out.println(sum);
		return sum;	//return；两个作用：1.结束方法运行 2.返回值
	}
}
