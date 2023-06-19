package day05;

public class StaticDemo {
	public static void main(String[] args) {
		// a 是各自的, b 是公用的
		Loo loo1 = new Loo(); // a for loo1:1   b for all: 1
		loo1.show();
		Loo loo2 = new Loo(); // a for loo2:1   b for all: 2
		loo2.show();
		Loo loo3 = new Loo(); // a for loo3:1   b for all: 3
		loo2.show();

		// Noo 静态块执行，Noo构造方法执行
		Noo noo1 = new Noo();
		// Noo构造方法执行
		Noo noo2 = new Noo();
	}
}
class Loo { // 演示静态变量
	int a;
	// 静态变量
	static int b;

	Loo() {
		a++;
		b++;
	}

	void show() {
		System.out.printf("a=%d, b=%d%n", a, b);
	}
}

class Moo { // 演示静态方法
	int a;
	static int b; // 静态变量

	void show() { // 实例方法
		System.out.println(a);
		System.out.println(b);
	}

	static void test() { //
//		System.out.println(a); //静态方法只能访问静态变量
		System.out.println(b);
	}

}
class Noo { // 演示静态块
	static {
		System.out.println("静态块");
	}

	Noo() {
		System.out.println("构造方法");
	}
}
