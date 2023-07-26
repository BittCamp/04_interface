package sungJuk;//[ 김찬영  2023-07-26 오후 12:33:09 ]ㄴ

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukService {
	private ArrayList<SungJukDTO> arrayList = new ArrayList<SungJukDTO>();
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		SungJuk sungJuk = null; 
		int num;
		
		while(true) {
			System.out.println("**************");
			System.out.println("    1.입력");
			System.out.println("    2.출력");
			System.out.println("    3.수정");
			System.out.println("    4.삭제");
			System.out.println("    5.정렬");
			System.out.println("    6.종료");
			System.out.println("**************");
			System.out.print("     번호: ");
			num = scan.nextInt();
			if(num == 6) break; // 부모로 접근하고 new 자식으로 생성하면 부모 = 자식. 아니면 다중으로 메모리 사용되서 안됨.
			if(num == 1) sungJuk = new SungJukInsert(); // 부모 = new 자식
			else if (num == 2) sungJuk = new SungJukList();
			else if (num == 3)sungJuk = new SungJukUpdate();
			else if (num == 4)sungJuk = new SungJukDelete();
			else if (num == 5)sungJuk = new SungJukSort();
			
			
			sungJuk.execute(arrayList); // 호출. 해당 성적 쪽으로 가서 해당 execute 를 실행해라.
			
		}// while
			
	}
}