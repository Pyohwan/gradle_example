package info.thecodinglive;

public class Calculator {
	String msg = "";

	public int sum(Integer num1, Integer num2) {
		return num1 + num2;
	}

	public Calculator() {
	}

	public Calculator(String msg) {
		this.msg = msg;
		System.out.println(msg);
	}

	public static int staticSum(int num1, int num2) {
		return num1 + num2;
	}
}
