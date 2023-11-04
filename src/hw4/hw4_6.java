package hw4;

public class hw4_6 {
	public static void main(String[] args) {
		//1號,1考....
		//Arrays = [i][0] -> 學號
		//Arrays = [i][1] -> 皆設為0,代表先預設每位學生考最高分的次數
		int [][]Arrays = {
				{1,0,10,37,100,77,98,90}, 
				{2,0,35,75,70,95,70,80},  
				{3,0,40,77,79,70,89,100}, 
				{4,0,100,89,90,89,90,75},
				{5,0,90,64,75,60,75,50},
				{6,0,85,75,70,75,90,20},
				{7,0,75,70,79,85,89,99},
				{8,0,70,95,90,89,90,75}
		};

		//i->第幾個人
		//j->比幾次
		for(int j=2;j<=7;j++) {
			//最高分預設為0
			int maxpoint = 0;
			//考最高分的人
			int max=0;
			for(int i=0;i<Arrays.length;i++) {
				if (Arrays[i][j]> maxpoint) {
					maxpoint = Arrays[i][j];
					max = i;
				}
			}
			Arrays[max][1]++;
		}
		for(int i=0;i<Arrays.length;i++) {
			System.out.println((i+1)+"號考"+Arrays[i][1]+"次最高分");
		}
	}
}
