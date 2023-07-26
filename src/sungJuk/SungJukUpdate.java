package sungJuk;//[ 김찬영  2023-07-26 오후 12:33:09 ]ㄴ

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukUpdate implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("수정할 학생의 번호를 입력하시오.");
		int no = scan.nextInt();
		
		int sw = 0;// switch변수 표시를 하자는 뜻이다.
		for(SungJukDTO sungJukDTO : arrayList) {
			if( sungJukDTO.getNo()== no) {
				//수정
				sw =1;
				
				System.out.println("\t번호\t이름\t국어\t영어\t수학\t총점\t평균");
				System.out.println(sungJukDTO);
				System.out.println();
				
				System.out.print("수정할 이름 입력: ");
				String name  = scan.next();
				System.out.print("수정할 국어 입력: ");
				int kor = scan.nextInt();
				System.out.print("수정할 영어 입력: ");
				int eng  = scan.nextInt();
				System.out.print("수정할 수학 입력: ");
				int math = scan.nextInt();
				
				sungJukDTO.setName(name);
				sungJukDTO.setKor(kor);
				sungJukDTO.setEng(eng);
				sungJukDTO.setMath(math);
				
				sungJukDTO.calc();
				
				System.out.println("수정완료");
				
				break;
			} //if
		}//for
		if ( sw == 0)
			System.out.println("잘못된 번호입니다.");
	}

}
