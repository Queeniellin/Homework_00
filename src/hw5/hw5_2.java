package hw5;

public class hw5_2 {
	public static void main(String[] args) {
		System.out.println("-------第二題-------");

		randAvg();
		
	}

	public static void randAvg() {
		int r; // 亂數
		int total = 0; // 數字總和
		for (int i = 1; i <= 10; i++) {
			r = (int) (Math.random() * 100);
			total+=r;
			
			System.out.print(r+" ");
		}
		System.out.println();
		System.out.println("平均:"+ total/10);
	}
}
