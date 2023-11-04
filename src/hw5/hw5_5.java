package hw5;

public class hw5_5 {
	public static void main(String[] args) {
		System.out.println("---第五題_驗證碼---");

		
		System.out.println(genAuthCode());
		
		
		
	}
	

	public static String genAuthCode() {
		// 0-9 48-57
		// A-Z 65-90
		// a-z 97-122

		//從0開始跑,跑8次
		int count = 0;
		int n = 0;
		String s = "";
		while (count < 8) {
			
			n= (int) (Math.random() * 75) + 48;
			
				if (n > 57 && n < 65) {
					continue;
				}
				if (n > 90 && n < 97) {
					continue;
				}
	

			count++;
			
			char c = (char)n;
			s = s + String.valueOf(c);
		}
		

		return s ;
	}
}
