package sungJuk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SungJukSort implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		Scanner scan = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("***********************");
			System.out.println("    1. 총점으로 내림차순");
			System.out.println("    2. 이름으로 오름차순");
			System.out.println("    3. 이전 메뉴");
			System.out.println("***********************");
			System.out.print  ("    번호 : ");
			num = scan.nextInt();
			
			if(num == 3) break;
			if(num == 1) {
				Collections.sort(arrayList);
				
			}else if(num == 2) {
				Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {

					@Override
					public int compare(SungJukDTO s1, SungJukDTO s2) {
						return s1.getName().compareTo(s2.getName());
					}
				};
				
				Collections.sort(arrayList, com);
			}//if
			
			//출력
			for(SungJukDTO sungJukDTO : arrayList) {
				System.out.println(sungJukDTO);
			}
			
		}//while

	}

}







