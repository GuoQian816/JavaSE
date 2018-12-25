/**
 * 测试字符类型和布尔类型
 * @author Administrator
 *
 */
public class TestPrimitiveDateType3 {
	public static void main(String[] args){
		
		//测试字符类型  2byte 
		char a = 'a';
		char b = '中';
		char c = '\u0061';
		System.out.println(c);
		
		//转义字符
		System.out.println(""+'a' +'\n'+'b');
		System.out.println(""+'a' +'\t'+'b');
		System.out.println(""+'a'+'\''+'b');
		
		//字符串 
		String d = "abc";
		
		//测试布尔类型 1bit 不能用数字表示
		boolean man = true;
		if(man){ //不要写man==true less is more
			System.out.println("男性");
		}
	}
}
