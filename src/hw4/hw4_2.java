package hw4;

public class hw4_2 {
	public static void main(String[] args) {
		System.out.println("-------第二題-------");
		
		String s = "Hello World";
		char[]chars1 = s.toCharArray();
		
		//方法二：
		//char[]chars1 = new char [s.length()];
		//s.getChars(0,s.length(),chars1,0);
		//System.out.println(chars1);
		
		//反轉
		for(int i = chars1.length - 1; i>=0;i--) {
			System.out.print(chars1[i]);
		}
		
	}
	
}
