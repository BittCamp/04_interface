package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class SungJukInsert_me implements SungJuk_me{

	@Override
	public void execute(ArrayList<SungJukDTO_me> arrayList) {
		Scanner scan = new Scanner(System.in);
		int number,korea,math,english; String name;
		
		System.out.print("번호를 입력하세요. ");
		number = scan.nextInt();
		
		System.out.print("이름를 입력하세요. ");
		name = scan.next();

		System.out.print("국어점수를 입력하세요. ");
		korea = scan.nextInt();
		
		System.out.print("수학점수를 입력하세요. ");
		math = scan.nextInt();
		
		System.out.print("영어점수를 입력하세요. ");
		english = scan.nextInt();
		
		int total = 0;
		int average = 0;
		
		SungJukDTO_me sungJukDTO = new SungJukDTO_me(number, name, korea, math, english,total,average);

		arrayList.add(sungJukDTO);
		sungJukDTO.calc();
	
	}
	
}
