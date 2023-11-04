package hw4;

public class hw4_3 {
	public static void main(String[] args) {
		System.out.println("-------第三題-------");

		String[] Arrays = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		char[] c = {'a','e','i','o','u'};
		// 母音
		int[] num = new int[5];
		// 幾個字串
		for (int S1 = 0; S1 < Arrays.length; S1++) {
			//比對
			String s = Arrays[S1];
			char[] chars1 = s.toCharArray();
			for (int j = 0; j < s.length(); j++) {
				
				for (int c1=0; c1 < c.length; c1++) {
					if (chars1[j] == c[c1]) {
						num[c1]++;
					}
				}
			}
		}
		
		for (int x = 0; x < 5; x++) {
			System.out.println("母音" + c[x] + "共有" + num[x] + "個");
		}

	}
}
