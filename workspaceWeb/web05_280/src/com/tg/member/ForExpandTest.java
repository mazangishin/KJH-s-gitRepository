package com.tg.member;

import java.util.ArrayList;
import java.util.List;

public class ForExpandTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numList = new ArrayList<Integer>();
		
		for (int i = 0; i < 5; i++) {
			numList.add(i+1);
		}
		
		for (Integer num : numList) {
			System.out.println(num);
		}
		
		String[] strArr = new String[3];
		
		strArr[0] = "글자";
		strArr[1] = "222";
		strArr[2] = "글자 222";
		
		for (String str : strArr) {
			System.out.println(str);
		}
		
	}

}
