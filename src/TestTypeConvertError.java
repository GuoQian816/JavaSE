/**
 * 测试强制类型转化和常见错误
 * @author Administrator
 *
 */
public class TestTypeConvertError {
	public static void main(String[] args){
		int money = 1000000000;	//10亿  int容量12亿
		int year = 20;
		int total = money*year;
		System.out.println(total);
		//返回total是负数超出了int的范围
		long total1 = money*year;
		System.out.println(total1);
		//返回total1还是负数 ，默认是int，因此结果会转为int值再转为long值。但是已经发生改变
		long total2 = ((long)money)*year;
		System.out.println(total2);
		//返回Total2正确  先将一个因子变为long 整个表达式发生提升 全部用long来计算
		
		long total3 = 34L*3223*year*223423;	//防止溢出首个数字转化为long类型
		System.out.println(total3);
		
		//命名问题  不要用小写L容易与1混淆
		int l = 2;
		long a = 23451l;
		System.out.println(l+1);
	
		
	}
}
