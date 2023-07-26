package sungJuk;//[ 김찬영  2023-07-26 오후 12:33:05 ]

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class SungJukInsert implements SungJuk{

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		//데이터
		Scanner scan = new Scanner(System.in);
		
		System.out.print("번호 입력: ");
		int no  = scan.nextInt();
		System.out.print("이름 입력: ");
		String name = scan.next();
		System.out.print("국어 입력: ");
		int kor = scan.nextInt();
		System.out.print("영어 입력: ");
		int eng = scan.nextInt();
		System.out.print("수학 입력: ");
		int math = scan.nextInt();
		
		SungJukDTO sungJukDTO = new SungJukDTO(no,name,kor,eng,math);
		sungJukDTO.calc();
		System.out.println("등록 완료.");
		
		arrayList.add(sungJukDTO);
		
	}
	
}
