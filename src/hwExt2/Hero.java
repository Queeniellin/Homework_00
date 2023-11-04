package hwExt2;

public abstract class Hero {
	// 省略 getter/setter...
	
	private String name;
	private int level;
	private double exp;
	
	public Hero() {
		this("David", 1, 0);
	}
	
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;   //經驗值
	}
	
	public abstract void attack();  //攻擊
	
	public abstract void move();    //移動
	
	public abstract void defend();  //防禦
}
