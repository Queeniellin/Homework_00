package hw1;

public class hw1 {
	public static void main(String[] args){
		//第一題
		System.out.println("-------第一題-------");
		int a=12;
		int b=6;
	    System.out.println("和:"+(a+b));
	    System.out.println("積:"+a*b);
	    
	    //第二題
	    System.out.println("-------第二題-------");
	    int egg=200;
	    System.out.println((egg/12)+"打");
	    System.out.println(egg%12+"顆");
	    
	    //第三題
	    System.out.println("-------第三題-------");
	    int s1=256559;
	    int s2=0,m=0,hr=0,d=0;
	    s2=s1%60;
	    hr=((s1/60)/60)%24;
	    m=(s1/60)%60;
	    d=((s1/60)/60)/24;
	    System.out.println(d+"天"+hr+"時"+m+"分"+s2+"秒");
	    
	    //第四題
	    System.out.println("-------第四題-------");
	    double circle=3.1415;
	    double r=5;
	    System.out.println("圓周長:"+(r+r)*circle);
	    System.out.println("圓面積:"+r*r*circle);
	   
	    //第五題
	    //S=P(1+i)n
	    //某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)
	    System.out.println("-------第五題-------");
	    double money=1500000.0;
	    double S=0.0;
	    double R=0.02;
	    S=money*Math.pow(1+R, 10);
	    System.out.println(S);
	  
	    //第六題
	    System.out.println("-------第六題-------");
	    //兩個5都是整數、值的相加，故運算總和為10。
	    System.out.println("結果為:"+(5+5));
	    //第一個5為整數,'5'為字元,'5'於十六進位為35, 轉換十進位為53,故運算總和為58。
	    System.out.println("結果為:"+(5+'5'));
	    //第一個5為整數,"5"為字串，此並非值的相加,為字串串起來的結果,故呈現55。
	    System.out.println("結果為:"+5+"5");
    }
}
