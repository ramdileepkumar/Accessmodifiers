package accessmodifiers2;

import accessmodifiers.Student;

public class SubClass extends Student {

	public static void main(String[] args) {
		new SubClass().test();
	}

	public void test() {
		System.out.println(rollNumber);
		PrintRollNumber();
	}

}
