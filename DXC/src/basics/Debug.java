package basics;

import objectclass.student;

public class Debug {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		System.out.println("Debug-- main");
		int sum = cal.add(10, 20);
		System.out.println("The sum is--" +sum);
		student nymisha = new student("nymisha",456);
		student mystudent = new student();
		student yourstudent = new student("anjali");
		for(int a=0; a<5; a++) {
			int f =a+5 *3;
		}
	}

}
