package accessmodifiers;

public class Student {
	public int rollNumber=101;
	private long accountNumber=12345678;
	 String s1="dileep";
	 protected long number =123456;
	 
	
	public Student() {
		rollNumber=102;
	}
	//private Student() {
	//rollNumber=102;
	//}
	//Student(){
		//s1= "dileep";
		
	//}
	//protected Student() {
		//number=123456;
		
	//}
	public void PrintRollNumber(){
		System.out.println(rollNumber);
		
	}
	private void accountNumber() {
		System.out.println(accountNumber);
	}
	void Name() {
		System.out.println(s1);
	}
	protected void number(){
		System.out.println(number);
		
	}
	
	public static void main(String[] args) {
		Student s1= new Student();
		s1.accountNumber();
		s1.PrintRollNumber();
		s1.Name();
		s1.number();
	}

}
