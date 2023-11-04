package hw5;

public class Work03 {
	public static int maxElement(int x[][]) {
		
		int maxnum1=0;
		
		for(int j=0;j<x.length;j++) {
			for(int i=0;i<x[j].length;i++) {
				if(x[j][i]>maxnum1) {
					maxnum1 = x[j][i];
				}
			}
		}
		return maxnum1 ;
	}
	public static double maxElement(double x[][]) {
		
		double maxnum2=0.0;
		for(int j=0;j<x.length;j++) {
			for(int i=0;i<x[j].length;i++) {
				if(x[j][i]>maxnum2) {
					maxnum2 = x[j][i];
				}
			}
		}
		return maxnum2;
	}
}
