package day17;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		ArrayList arr01 = new ArrayList();
		arr.add("test"); //String 만 받을 수 있음.
//		arr.add(1234);
//		arr.add(1.23);
//		arr.add('a');
		String s = arr.get(2) + "문자열 연산입니다.";
//		double s = arr.get(3) + 1.111; //에러
		arr01.add(1234);
		
	}
}
