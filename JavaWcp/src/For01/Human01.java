package For01;

public class Human01 {
	public String name;//メンバー編数
	public int age;//メンバー変数

	//引数なしのコントラスタ
	public Human01() {
		name = "山田";
		age = 20;
	}

	//引数2つのコントラスタ
	public Human01(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
